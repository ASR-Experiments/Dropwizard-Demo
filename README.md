# DropWizard demo

This is a simple demo of a DropWizard application. It is a simple RESTful service that allows you to create, read,
update and delete users.

## Running the application

### Via **Intellij**

1. Import run configuration from `./idea/runConfigurations/TrueApplication.xml`
2. Click on the Run or Debug button to Run the application.

### Via **Maven**

1. Run the following command in the terminal:
    ```shell
    mvn clean install
    ```
2. Run the following command in the terminal:
    ```shell
    java -jar target/First-0.0.1-SNAPSHOT.jar server sample-config.yml
    ```
    1. _Need to update the properties first._

## What is covered ?

### Iteration 1

1. A basic Rest endpoint which shows Hello message to provided name, hit the following URL in browser to see it in
   action.
   > [http://localhost:8080/hello-world?name=John](http://localhost:8080/hello?name=John)
2. A basic health check to show health check of the web-server.
3. Basic configuration setup.

### Iteration 2

1. A basic Rest endpoint to interact with User table in Postgres.
    1. **Pre-requisite**: Postgres should be installed and running on the local machine.
        1. Create a database.
        2. Create a sequence for Id Generation.
           ```sql
           CREATE SEQUENCE IF NOT EXISTS user_schema.id_sequence
           INCREMENT 1
           START 1
           MINVALUE 1
           MAXVALUE 9223372036854775807
           CACHE 1;
           ```
        3. Finally, Create the following table:
           ```sql
           CREATE TABLE IF NOT EXISTS tbl_user
           (
              name character varying(128) NOT NULL,
              email character varying(128),
              password text NOT NULL,
              id bigint NOT NULL DEFAULT nextval('user_schema.id_sequence'::regclass),
              CONSTRAINT tbl_user_pkey PRIMARY KEY (id),
              CONSTRAINT "user" UNIQUE NULLS NOT DISTINCT (name)
           );
           ```
        4. Update `config.yml` by replacing the placeholders for database details,
           like `<DB_USER>`, `<DB_PASSWORD>`, `<DB_NAME>`,
           `<DB_HOST>`, `<DB_PORT>`.
    2. Hit the following URL in browser to see it in action.
       > [http://localhost:8080/user](http://localhost:8080/user)

       It will return an empty array for now, see code for more details on creation and rest of the CRUD operations on
       users.

### Iteration 3

1. Added Guice based dependency injection framework.
    1. Added Guice based configuration for the application.
    2. Moved custom beans (objects) to bundles and modules for reusability.
    3. Added annotations like:
        1. `@Singleton` for singleton beans identification.
        2. `@Inject` for dependency injection.
    4. Inherited `Managed` for non-dropwizard components like `SampleDownstreamService` for _DI_ identification.
