package org.asr.experiments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.Configuration;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.asr.experiments.config.DatabaseConfiguration;

public class TrueConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    @Valid
    @NotNull
    private DatabaseConfiguration databaseConfig = new DatabaseConfiguration();

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
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
}
