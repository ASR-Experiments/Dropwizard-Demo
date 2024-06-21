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
    java -jar target/First-0.0.1-SNAPSHOT.jar server config.yml
    ```

## What is covered ?

### Iteration 1

1. A basic Rest endpoint which shows Hello message to provided name, hit the following URL in browser to see it in
   action.
   > [http://localhost:8080/hello-world?name=John](http://localhost:8080/hello?name=John)
2. A basic health check to show health check of the web-server.
3. Basic configuration setup.