package org.asr.experiments.module;

import com.google.inject.Provides;
import com.google.inject.Singleton;
import io.dropwizard.client.JerseyClientBuilder;
import jakarta.ws.rs.client.Client;
import org.asr.experiments.bundle.DatabaseBundle;
import org.asr.experiments.config.TrueConfiguration;
import org.hibernate.SessionFactory;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

public class DependencyModule extends DropwizardAwareModule<TrueConfiguration> {

    private final DatabaseBundle databaseBundle;

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
}