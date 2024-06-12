package org.asr.experiments;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class TrueApplication extends Application<TrueConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TrueApplication().run(args);
    }

    @Override
    public String getName() {
        return "true";
    }

    @Override
    public void initialize(final Bootstrap<TrueConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TrueConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
