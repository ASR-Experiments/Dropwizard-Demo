package org.asr.experiments.resources.filter;

import jakarta.inject.Inject;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import org.asr.experiments.config.TrueConfiguration;

/**
 * Filter to add a X-Powered-By header to the response from the configuration.
 */
public class PoweredByFilter implements ContainerResponseFilter {

    private final TrueConfiguration configuration;

    @Inject
    public PoweredByFilter(TrueConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        responseContext.getHeaders().add("X-Powered-By", configuration.getPoweredBy().orElse("ASR"));
    }
}
