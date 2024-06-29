# Change Log

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## **Iteration 5**: [0.0.5] - 2024-06-28

1. Enabled **Authentication**.
    1. Added basic authentication filter using `UserEntity` from database (using `username` and `password`
       from `tbl_user`).
    2. Inherited `UserEntity` from `Principal` for authentication.
    3. Added support for `Caching` Authentication.
2. Enabled **Authorization**
    1. Added role based authorization based on roles provided by `@RolesAllowed` annotation (Either `"ADMIN"`
       or `"USER"`).
    2. Roles of user are added as a field in `UserEntity` which is fetched from database.
    3. Added support for `Caching` Authorization.

## **Iteration 4**: [0.0.4] - 2024-06-24

1. Added 2 sample filters on Request and response respectively:
    1. `IdepotencyRequestFilter` filters the request based on the `Idempotency-Key` header.
        * It expects a unique header for each requests.
        * If header is not present then it invalidates the request.
        * If header is already used in a prior requests, it still invalidates the request.
    2. `PoweredByFilter` adds a header `X-Powered-By` to the response.
        * If configuration `poweredBy` is present, than value is set to be the same.
        * Otherwise, it defaults to `ASR`.

## **Iteration 3**: [0.0.4] - 2024-06-24

1. Added Guice based dependency injection framework.
    1. Added Guice based configuration for the application.
    2. Moved custom beans (objects) to bundles and modules for reusability.
    3. Added annotations like:
        1. `@Singleton` for singleton beans identification.
        2. `@Inject` for dependency injection.
    4. Inherited `Managed` for non-dropwizard components like `SampleDownstreamService` for _DI_ identification.

## **Iteration 2**: [0.0.4] - 2024-06-24

1. A basic Rest endpoint to interact with User table in Postgres.
    1. Hit the following URL in browser to see it in action.
       > [http://localhost:8080/user](http://localhost:8080/user)

       It will return an empty array for now, see code for more details on creation and rest of the CRUD operations on
       users.
2. Another endpoint to interact with Downstream Http API service.
    1. Hit the following URL in browser to see it in action.
       > [http://localhost:8080/employee](http://localhost:8080/employee)

       It will return a message from the downstream service.

## **Iteration 1**: [0.0.1] - 2024-06-24

1. A basic Rest endpoint which shows Hello message to provided name, hit the following URL in browser to see it in
   action.
   > [http://localhost:8080/hello-world?name=John](http://localhost:8080/hello?name=John)
2. A basic health check to show health check of the web-server.
3. Basic configuration setup.
