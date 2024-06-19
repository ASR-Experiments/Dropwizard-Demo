package org.asr.experiments.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.client.JerseyClientConfiguration;
import io.dropwizard.core.Configuration;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class HttpConfiguration extends Configuration {
    @Valid
    @NotNull
    private JerseyClientConfiguration jerseyClient = new JerseyClientConfiguration();

    @JsonProperty("httpClient")
    public @Valid @NotNull JerseyClientConfiguration getJerseyClient() {
        return jerseyClient;
    }

    @JsonProperty("httpClient")
    public void setJerseyClient(@Valid @NotNull JerseyClientConfiguration jerseyClient) {
        this.jerseyClient = jerseyClient;
    }
}
