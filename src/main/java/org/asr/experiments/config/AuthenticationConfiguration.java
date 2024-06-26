package org.asr.experiments.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.benmanes.caffeine.cache.CaffeineSpec;
import io.dropwizard.core.Configuration;
import jakarta.validation.Valid;

public class AuthenticationConfiguration extends Configuration {

    @Valid
    private CaffeineSpec cacheSpec = CaffeineSpec.parse("maximumSize=100, expireAfterAccess=1m");

    @JsonProperty("cache")
    public CaffeineSpec getCachePolicy() {
        return cacheSpec;
    }

    @JsonProperty("cache")
    public void setCacheSpec(CaffeineSpec cacheSpec) {
        this.cacheSpec = cacheSpec;
    }
}
