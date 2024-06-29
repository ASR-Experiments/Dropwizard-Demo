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

## What's Covered

1. **HealthCheck**: A simple health check to check the health of the application.
2. **HelloWorldEndpoint**: A simple endpoint that returns a message `Hello! <name>`.
3. **Database Interactions**: It covers the CRUD operations with a Postgres database.
4. **Downstream API Calls**: It covers the downstream API calls to a sample service.
5. **Authorization**: It covers the basic authorization for the APIs.
6. **Idempotency**: It covers the idempotency for the APIs.
7. **Logging**: It covers the logging for the application.

## Pre-Requisite

### Database setup

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
    5. Add another column for Authorization (added in Iteration 5 (0.0.5))
       ```sql
       ALTER TABLE IF EXISTS user_schema.tbl_user
          ADD COLUMN role character varying(16) DEFAULT USER;
       ```
    6. Add a sample user for testing.
       ```sql
         INSERT INTO tbl_user (name, email, password, role)
            VALUES ('username', 'username@test.com', 'password', 'ADMIN');
       ```

## APIs

1. A **HealthCheck** that returns the health of the application.
    * To access the endpoint, hit the following URL in the browser:
      > [http://localhost:8081/healthcheck](http://localhost:8081/healthcheck)
    * It will return the health of the application in the browser.
2. A **HelloWorldEndpoint** that returns a simple message `Hello! Stranger` to user. If a name is provided, it will
   return `Hello! <name>`.
    * To access the endpoint, hit the following URL in the browser:
      > [http://localhost:8080/hello-world](http://localhost:8080/hello-world)

      > It will return Hello! Stranger in the browser.
    * To get the message with a name, hit the following URL in the browser:
      > [http://localhost:8080/hello-world?name=John](http://localhost:8080/hello?name=John)

      > It will return `Hello! John` in the browser.
3. It also covers the Database interactions with a postgres database, check [Pre-requisites](###Database-setup).
    * To access the endpoint, hit the following URL in the **cURL** or other clients:
        ```shell
           curl --location 'localhost:8080/user' \
                --header 'X-Idempotency-Token: b415d958-b617-404b-80e9-009202a82395' \
                --header 'Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ='
        ```
      > It will return a response similar to following.
       ```json
         [{"id":1,"name":"username","email":"username@test.com","password":"password","role":"ADMIN"}]
       ```
    * To create a user, hit the following URL in **cURL** or other clients:
       ```shell
          curl --location 'localhost:8080/user' \
                --header 'X-Idempotency-Token: 918c92d5-0f03-4285-9ce3-2d3fdaa3b708' \
                --header 'Content-Type: application/json' \
                --header 'Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ=' \
                --data-raw '{
                "name": "user",
                "email": "user@test.com",
                "password": "password",
                "role": "USER"
                }'
        ```
      > It will return the created user in the response.
        ```json
          {"id":2,"name":"user","email":"user@test.com","password":"password","role":"USER"}
        ```
        * Calling the first api again, will respond with the newly created user.
        * Rest of the CRUD operations can be performed in a similar way by changing the method and payload.
            * For more information, check the code in `UserResource` class.
            * OR, check `/docs` folder.
4. Additionally, it also covers the downstream API calls to a sample service.
    * To access the endpoint, hit the following URL in the `cURL` or other clients:
        ```shell
           curl --location 'localhost:8080/sample' \
               --header 'X-Idempotency-Token: 918c92d5-0f03-4285-9ce3-2d3fdaa3b708' \
               --header 'Content-Type: application/json' \
               --header 'Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ='
        ```
    * It will return a response similar to following.
      ```json
      [
          {
              "id": 1,
              "name": "Leanne Graham",
              "username": "Bret",
              "email": "Sincere@april.biz",
              "address": {
                  "street": "Kulas Light",
                  "suite": "Apt. 556",
                  "city": "Gwenborough",
                  "zipcode": "92998-3874",
                  "geo": {
                      "lat": "-37.3159",
                      "lng": "81.1496"
                  }
              },
              "phone": "1-770-736-8031 x56442",
              "website": "hildegard.org",
              "company": {
                  "name": "Romaguera-Crona",
                  "catchPhrase": "Multi-layered client-server neural-net",
                  "bs": "harness real-time e-markets"
              }
          },
          .
          .
          .
      ]
      ```
