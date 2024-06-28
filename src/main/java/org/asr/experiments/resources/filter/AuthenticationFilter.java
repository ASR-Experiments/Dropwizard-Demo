package org.asr.experiments.resources.filter;

import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;
import org.asr.experiments.db.entity.UserEntity;
import org.asr.experiments.db.repository.UserDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.context.internal.ManagedSessionContext;

import java.util.Optional;

public class AuthenticationFilter implements Authenticator<BasicCredentials, UserEntity> {

    private final UserDao userDao;

    private final SessionFactory sessionFactory;

    public AuthenticationFilter(UserDao userDao, SessionFactory sessionFactory) {
        this.userDao = userDao;
        this.sessionFactory = sessionFactory;
    }

    /**
     * Authenticate the user based on the provided credentials.
     *
     * @param basicCredentials The credentials to authenticate.
     * @return An {@link Optional} of the authenticated user, if authentication was successful. Otherwise, an empty optional.
     * @implNote This method uses manual session management to ensure that the session is closed after the authentication process.
     */
    @Override
    public Optional<UserEntity> authenticate(BasicCredentials basicCredentials) {
        String username = basicCredentials.getUsername();
        if (username == null || username.isEmpty()) {
            return Optional.empty();
        }
        try (Session session = sessionFactory.openSession()) {
            ManagedSessionContext.bind(session);
            Optional<UserEntity> user = userDao.findByUsername(username);
            if (user.isPresent()) {
                boolean passwordMatches = user.get().getPassword().equals(basicCredentials.getPassword());
                if (passwordMatches) {
                    return user;
                }
            }
            return Optional.empty();
        } finally {
            ManagedSessionContext.unbind(sessionFactory);
        }
    }
}
