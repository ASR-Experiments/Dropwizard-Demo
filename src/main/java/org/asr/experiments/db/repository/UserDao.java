package org.asr.experiments.db.repository;

import io.dropwizard.hibernate.AbstractDAO;
import org.asr.experiments.db.entity.UserEntity;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class UserDao extends AbstractDAO<UserEntity> {
    public UserDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<UserEntity> findAll(int offset, int limit) {
        Query<UserEntity> query = currentSession().createQuery(
                "From UserEntity", UserEntity.class);
        query.setFirstResult(Math.max(offset, 0));
        query.setMaxResults(limit < 1 ? 10 : limit);
        return query.list();
    }

    public Optional<UserEntity> findById(Long id) {
        return Optional.ofNullable(get(id));
    }

    public UserEntity create(UserEntity user) {
        return persist(user);
    }

    public UserEntity update(UserEntity user) {
        return persist(user);
    }

    public void delete(UserEntity user) {
        currentSession().remove(user);
    }
}
