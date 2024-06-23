package org.asr.experiments.resources.filter;

import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Response;

public class IdempotencyRequestFilter implements ContainerRequestFilter {

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
    }
}