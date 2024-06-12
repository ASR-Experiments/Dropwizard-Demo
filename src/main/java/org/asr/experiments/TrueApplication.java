package org.asr.experiments;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.asr.experiments.health.TemplateHealthCheck;
import org.asr.experiments.resources.HelloWorldResource;

public class TrueApplication extends Application<TrueConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TrueApplication().run(args);
    }

    @Override
    public String getName() {
        return "true-application";
    }

    @Override
    public void initialize(final Bootstrap<TrueConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TrueConfiguration configuration,
                    final Environment environment) {
        HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        TemplateHealthCheck healthCheck = new TemplateHealthCheck(
                configuration.getTemplate()
        );

        environment.jersey().register(resource);
        environment.healthChecks().register("template", healthCheck);
    }

}
