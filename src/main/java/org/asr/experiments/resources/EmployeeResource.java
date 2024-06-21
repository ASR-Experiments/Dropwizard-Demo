package org.asr.experiments.resources;

import com.codahale.metrics.annotation.Timed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.asr.experiments.client.SampleDownstreamClient;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    private final SampleDownstreamClient client;

    @Inject
    public EmployeeResource(SampleDownstreamClient client) {
        this.client = client;
    }

    @GET
    @Timed
    public String getEmployees() {
        return client.getUsers();
    }
}
