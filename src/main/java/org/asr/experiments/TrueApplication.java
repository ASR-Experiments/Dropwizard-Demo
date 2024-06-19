package org.asr.experiments;

import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import jakarta.ws.rs.client.Client;
import org.asr.experiments.client.SampleDownstreamClient;
import org.asr.experiments.config.TrueConfiguration;
import org.asr.experiments.db.entity.UserEntity;
import org.asr.experiments.db.repository.UserDao;
import org.asr.experiments.health.DatabaseHealthCheck;
import org.asr.experiments.health.TemplateHealthCheck;
import org.asr.experiments.resources.EmployeeResource;
import org.asr.experiments.resources.HelloWorldResource;
import org.asr.experiments.resources.UserResource;

/**
 * This is the main application class for the project. It extends the Dropwizard Application class
 * and is parameterized with the configuration class (TrueConfiguration).
 * <p>
 * The Application class is the main entry point for a Dropwizard application. It pulls together
 * the various bundles and commands which provide basic functionality.
 *
 * @see io.dropwizard.core.Application
 */
public class TrueApplication extends Application<TrueConfiguration> {

    private final HibernateBundle<TrueConfiguration> hibernateBundle = new HibernateBundle<>(UserEntity.class) {
        @Override
        public DataSourceFactory getDataSourceFactory(TrueConfiguration configuration) {
            return configuration.getDatabaseConfig().getDataSourceFactory();
        }
    };

    public static void main(final String[] args) throws Exception {
        new TrueApplication().run(args);
    }

    @Override
    public String getName() {
        return "true-application";
    }

    @Override
    public void initialize(final Bootstrap<TrueConfiguration> bootstrap) {
        bootstrap.addBundle(hibernateBundle);
    }

    @Override
    public void run(final TrueConfiguration configuration,
                    final Environment environment) {

//        Http
        Client httpClient = new JerseyClientBuilder(environment)
                .using(configuration.getHttpConfig().getJerseyClient())
                .build(getName());
        SampleDownstreamClient sampleDownstreamClient = new SampleDownstreamClient(
                httpClient
        );
        environment.jersey().register(new SampleDownstreamClient(httpClient));
//        Database
        UserDao userDao = new UserDao(hibernateBundle.getSessionFactory());
//        Resources
        HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        UserResource userResource = new UserResource(
                new UserDao(hibernateBundle.getSessionFactory())
        );
//        Health checks
        TemplateHealthCheck healthCheck = new TemplateHealthCheck(
                configuration.getTemplate()
        );
        DatabaseHealthCheck databaseHealthCheck = new DatabaseHealthCheck(
                hibernateBundle.getSessionFactory()
        );
        EmployeeResource employeeResource = new EmployeeResource(
                sampleDownstreamClient
        );
//        Registering DAOs
        environment.jersey().register(userDao);
//        Registering resources
        environment.jersey().register(resource);
        environment.jersey().register(userResource);
        environment.jersey().register(employeeResource);
//        Registering health checks
        environment.healthChecks().register("template", healthCheck);
        environment.healthChecks().register("database", databaseHealthCheck);
    }

}
