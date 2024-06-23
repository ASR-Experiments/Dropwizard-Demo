package org.asr.experiments.resources.filter;

import jakarta.inject.Inject;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Response;
import org.asr.experiments.config.IdempotencyCacheConfiguration;

import java.time.Instant;

/**
 * Filter that checks if the request has an Idempotency-Key header and if the request with the same key has already been processed.
 */
public class IdempotencyRequestFilter implements ContainerRequestFilter {

    private final IdempotencyCacheConfiguration cache;

    @Inject
    public IdempotencyRequestFilter(IdempotencyCacheConfiguration cache) {
        this.cache = cache;
    }

    @Override
    public void filter(ContainerRequestContext requestContext) {
        String idempotencyKey = requestContext.getHeaderString("X-Idempotency-Token");
        if (idempotencyKey == null || idempotencyKey.isEmpty()) {
            Response response = Response.status(Response.Status.BAD_REQUEST)
                    .entity("{\"type\": \"error\", \"message\": \"Idempotency-Key header is missing\"}")
                    .type("application/json")
                    .build();
            throw new WebApplicationException(response);
        }
        if (cache.contains(idempotencyKey)) {
            Response response = Response.status(Response.Status.CONFLICT)
                    .entity("{\"type\": \"error\", \"message\": \"Request with the same Idempotency-Key has already been processed\"}")
                    .type("application/json")
                    .build();
            throw new WebApplicationException(response);
        }
        cache.put(idempotencyKey, Instant.now().toString());
    }
}