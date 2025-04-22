# Spring Boot Project with Gradle - S04T01N02

This is a Spring Boot project built with Gradle as the dependency manager.

## Requirements

* Java JDK (minimum version 11)
* Gradle installed
* Postman (or a similar HTTP client) for testing the API endpoints

## How to run the application

1.  Navigate to the root directory of the project in your terminal.
2.  Run the Gradle command to start the application:
    ```bash
    gradle bootRun
    ```
3.  The application will be accessible at `http://localhost:9001`.

## API Endpoints

This API has been tested using Postman.

* `GET /api/HelloWorld`: Returns a greeting with an optional "nombre" parameter (default is "UNKNOWN").
    * **Example (Postman):** Send a GET request to `http://localhost:9001/api/HelloWorld` or `http://localhost:9001/api/HelloWorld?nombre=YourName`.
* `GET /api/HelloWorld2/{nombre}`: Returns a greeting with an optional "nombre" parameter in the path.
    * **Example (Postman):** Send a GET request to `http://localhost:9001/api/HelloWorld2` or `http://localhost:9001/api/HelloWorld2/YourName`.

## Gradle Commands

* `gradle build`: Compiles the project.
* `gradle assemble`: Packages the project.
* `gradle clean`: Cleans the build directory.
* `gradle bootRun`: Runs the Spring Boot application.
