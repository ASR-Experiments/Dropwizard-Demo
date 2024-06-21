package org.asr.experiments.resources;

import com.codahale.metrics.annotation.Timed;
import io.dropwizard.hibernate.UnitOfWork;
import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.asr.experiments.db.entity.UserEntity;
import org.asr.experiments.db.repository.UserDao;

import java.util.List;
import java.util.Optional;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    private final UserDao userDao;

    @Inject
    public UserResource(UserDao userDao) {
        this.userDao = userDao;
    }

    @GET
    @Timed
    @UnitOfWork
    public List<UserEntity> getAllUsers() {
        return userDao.findAll(0, 10);
    }

    @GET
    @Path("/{id}")
    @Timed
    @UnitOfWork
    public Optional<UserEntity> findUser(@PathParam("id") Long id) {
        return userDao.findById(id);
    }

    @POST
    @Timed
    @UnitOfWork
    public UserEntity addUser(UserEntity userEntity) {
        return userDao.create(userEntity);
    }

    @DELETE
    @Path("/{id}")
    @Timed
    @UnitOfWork
    public Optional<UserEntity> deleteUser(@PathParam("id") Long id) {
        Optional<UserEntity> user = userDao.findById(id);
        if (user.isPresent()) {
            userDao.delete(user.get());
            return Optional.of(user.get());
        }
        return Optional.empty();
    }

    @PUT
    @Path("/{id}")
    @Timed
    @UnitOfWork
    public Optional<UserEntity> updateUser(@PathParam("id") Long id, UserEntity userEntity) {
        return userDao.update(id, userEntity);
    }
}
