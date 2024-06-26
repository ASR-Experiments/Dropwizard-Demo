package org.asr.experiments.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.Configuration;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Optional;

public class TrueConfiguration extends Configuration {

    private String poweredBy;

    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    @Valid
    @NotNull
    private DatabaseConfiguration databaseConfig = new DatabaseConfiguration();

    @Valid
    @NotNull
    private HttpConfiguration httpConfig = new HttpConfiguration();

    @Valid
    private AuthenticationConfiguration authenticationConfiguration = new AuthenticationConfiguration();

    @JsonProperty("template")
    public String getTemplate() {
        return template;
    }

    @JsonProperty("template")
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty("defaultName")
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty("defaultName")
    public void setDefaultName(String name) {
        this.defaultName = name;
    }

    @JsonProperty("database")
    public @Valid @NotNull DatabaseConfiguration getDatabaseConfig() {
        return databaseConfig;
    }

    @JsonProperty("database")
    public void setDatabaseConfig(@Valid @NotNull DatabaseConfiguration databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    @JsonProperty("http")
    public @Valid @NotNull HttpConfiguration getHttpConfig() {
        return httpConfig;
    }

    @JsonProperty("http")
    public void setHttpConfig(@Valid @NotNull HttpConfiguration httpConfig) {
        this.httpConfig = httpConfig;
    }

    @JsonProperty("poweredBy")
    public Optional<String> getPoweredBy() {
        return Optional.ofNullable(poweredBy);
    }

    @JsonProperty("poweredBy")
    public void setPoweredBy(String poweredBy) {
        this.poweredBy = poweredBy;
    }

    @JsonProperty("authentication")
    public void setAuthentication(AuthenticationConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    @JsonProperty("authentication")
    public AuthenticationConfiguration getAuthConfig() {
        return authenticationConfiguration;
    }
}
