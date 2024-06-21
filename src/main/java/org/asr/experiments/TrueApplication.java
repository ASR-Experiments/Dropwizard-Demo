package org.asr.experiments;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.asr.experiments.bundle.DatabaseBundle;
import org.asr.experiments.config.TrueConfiguration;
import org.asr.experiments.module.DependencyModule;
import ru.vyarus.dropwizard.guice.GuiceBundle;

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

    public static void main(final String[] args) throws Exception {
        new TrueApplication().run(args);
    }

    @Override
    public String getName() {
        return "true-application";
    }

    @Override
    public void initialize(final Bootstrap<TrueConfiguration> bootstrap) {
        DatabaseBundle databaseBundle = new DatabaseBundle();

        GuiceBundle guiceBundle = GuiceBundle.builder()
                .modules(new DependencyModule(databaseBundle))
                .dropwizardBundles(databaseBundle)
                .enableAutoConfig()
//                .printAllGuiceBindings()
//                .printDiagnosticInfo()
//                .printWebMappings()
                .build();

        bootstrap.addBundle(guiceBundle);
    }

    @Override
    public void run(final TrueConfiguration configuration,
                    final Environment environment) {
    }
}
