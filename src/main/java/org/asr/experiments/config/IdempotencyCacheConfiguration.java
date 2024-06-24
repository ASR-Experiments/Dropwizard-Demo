package org.asr.experiments.config;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.inject.Singleton;
import io.dropwizard.lifecycle.Managed;

import java.util.concurrent.TimeUnit;

@Singleton
public class IdempotencyCacheConfiguration implements Managed {

    private final LoadingCache<String, String> idempotencyCache;

    public IdempotencyCacheConfiguration() {
        idempotencyCache = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .build(
                        new CacheLoader<>() {
                            @Override
                            public String load(String key) {
                                return key;
                            }
                        }
                );
    }

    public boolean contains(String key) {
        return idempotencyCache.getIfPresent(key) != null;
    }

    public void put(String key, String value) {
        idempotencyCache.put(key, value);
    }
}
