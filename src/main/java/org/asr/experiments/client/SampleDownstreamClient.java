package org.asr.experiments.client;

import io.dropwizard.lifecycle.Managed;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriBuilder;

@Singleton
public class SampleDownstreamClient implements Managed {

    private final Client httpClient;

    @Inject
    public SampleDownstreamClient(Client httpClient) {
        this.httpClient = httpClient;
    }

    public String getUsers() {
        UriBuilder uriBuilder = UriBuilder
                .fromUri("https://jsonplaceholder.typicode.com/users");
        return httpClient
                .target(uriBuilder.build())
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
    }
}
