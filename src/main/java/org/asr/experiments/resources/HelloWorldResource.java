package org.asr.experiments.resources;

import com.codahale.metrics.annotation.Timed;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.asr.experiments.api.SayingDto;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RolesAllowed("ADMIN")
@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    @Inject
    public HelloWorldResource(
            @Named("template") String template,
            @Named("defaultName") String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    @PermitAll
    public SayingDto sayHello(
            @QueryParam("name") Optional<String> name
    ) {
        final String value = String.format(template, name.orElse(defaultName));
        return new SayingDto(counter.incrementAndGet(), value);
    }
}
