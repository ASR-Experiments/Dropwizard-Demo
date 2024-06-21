package org.asr.experiments.bundle;

import io.dropwizard.db.DataSourceFactory;
import org.asr.experiments.config.TrueConfiguration;
import org.asr.experiments.db.entity.UserEntity;

public class DatabaseBundle extends io.dropwizard.hibernate.HibernateBundle<TrueConfiguration> {
    public DatabaseBundle() {
        super(UserEntity.class);
    }

    @Override
    public DataSourceFactory getDataSourceFactory(TrueConfiguration configuration) {
        return configuration.getDatabaseConfig().getDataSourceFactory();
    }
}