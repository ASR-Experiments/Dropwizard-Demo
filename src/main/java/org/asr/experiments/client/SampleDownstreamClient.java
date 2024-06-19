package org.asr.experiments.client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriBuilder;

public class SampleDownstreamClient {

    private final Client httpClient;

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
