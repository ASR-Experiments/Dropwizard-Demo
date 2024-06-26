package org.asr.experiments.module;

import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import io.dropwizard.auth.AuthDynamicFeature;
import io.dropwizard.auth.CachingAuthenticator;
import io.dropwizard.auth.basic.BasicCredentialAuthFilter;
import io.dropwizard.auth.basic.BasicCredentials;
import io.dropwizard.client.JerseyClientBuilder;
import jakarta.ws.rs.client.Client;
import org.asr.experiments.bundle.DatabaseBundle;
import org.asr.experiments.config.TrueConfiguration;
import org.asr.experiments.db.entity.UserEntity;
import org.asr.experiments.db.repository.UserDao;
import org.asr.experiments.resources.filter.AuthenticationFilter;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DependencyModule extends DropwizardAwareModule<TrueConfiguration> {

    private final Logger log = LoggerFactory.getLogger(DependencyModule.class);

    private final DatabaseBundle databaseBundle;

    @Override
    protected void configure() {
        super.configure();
        for (Method method : TrueConfiguration.class.getMethods()) {
            if (method.getName().startsWith("get") &&
                    method.getParameterCount() == 0 &&
                    method.getReturnType() == String.class) {
                String propertyName = method.getName().substring(3);
                String finalPropertyName = Character.toLowerCase(propertyName.charAt(0)) + propertyName.substring(1);
                bind(String.class)
                        .annotatedWith(Names.named(finalPropertyName))
                        .toProvider(() -> {
                            try {
                                return method.invoke(configuration()).toString();
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                log.error("Error while reading property `{}` from configuration", finalPropertyName, e);
                                return null;
                            }
                        });
            }
        }
    }

    public DependencyModule(DatabaseBundle databaseBundle) {
        this.databaseBundle = databaseBundle;
    }

    @Provides
    @Singleton
    public Client provideHttpClient() {
        return new JerseyClientBuilder(environment())
                .using(configuration().getHttpConfig().getJerseyClient())
                .build(environment().getName());
    }

    @Provides
    @Singleton
    public SessionFactory provideSessionFactory() {
        return databaseBundle.getSessionFactory();
    }

    @Provides
    @Singleton
    public UserDao provideUserDao() {
        return new UserDao(databaseBundle.getSessionFactory());
    }

    @Provides
    @Singleton
    public AuthDynamicFeature provideAuthenticator() {
        // For Authentication
        AuthenticationFilter authenticationFilter = new AuthenticationFilter(this.provideUserDao(), this.provideSessionFactory());
        // For Caching the authentication credentials
        CachingAuthenticator<BasicCredentials, UserEntity> cachingAuthenticator = new CachingAuthenticator<>(
                environment().metrics(),
                authenticationFilter,
                configuration().getAuthConfig().getCachePolicy()
        );
        return new AuthDynamicFeature(
                new BasicCredentialAuthFilter.Builder<UserEntity>()
                        .setAuthenticator(cachingAuthenticator)
                        .setRealm("SUPER SECRET STUFF")
                        .buildAuthFilter()
        );
    }
}