package org.asr.experiments.resources.filter;

import io.dropwizard.auth.AuthorizationContext;
import io.dropwizard.auth.Authorizer;
import jakarta.ws.rs.container.ContainerRequestContext;
import org.asr.experiments.db.entity.AuthRole;
import org.asr.experiments.db.entity.UserEntity;
import org.checkerframework.checker.nullness.qual.Nullable;

public class AuthorizationFilter implements Authorizer<UserEntity> {
    @Override
    public boolean authorize(
            UserEntity userEntity,
            String role,
            @Nullable ContainerRequestContext containerRequestContext
    ) {
        try {
            AuthRole expectedRole = AuthRole.valueOf(role);
            switch (expectedRole) {
                case ADMIN:
                    return userEntity.getRole().equals(AuthRole.ADMIN);
                case USER:
                    return userEntity.getRole().equals(AuthRole.USER) || userEntity.getRole().equals(AuthRole.ADMIN);
            }
            return expectedRole.equals(userEntity.getRole());
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public AuthorizationContext<UserEntity> getAuthorizationContext(
            UserEntity principal,
            String role,
            @Nullable ContainerRequestContext requestContext
    ) {
        return Authorizer.super.getAuthorizationContext(principal, role, requestContext);
    }
}
