package org.asr.experiments.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.Configuration;
import io.dropwizard.db.DataSourceFactory;

public class DatabaseConfiguration extends Configuration {
    private DataSourceFactory database;

    @JsonProperty("source")
    public DataSourceFactory getDataSourceFactory() {
        if (database == null) {
            database = new DataSourceFactory();
        }
        return database;
    }

    @JsonProperty("source")
    public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
        this.database = dataSourceFactory;
    }

}
