# Project Base for Vaadin and Spring Boot

This project is based on the [Vaadin's starter project](https://vaadin.com/start/v14) and aims to employ the [Enhanced Rich Text Editor](https://vaadin.com/directory/component/enhanced-rich-text-editor/overview) in a minimalistic application.

## Running the Application

Import the project to the IDE of your choosing as a Maven project.

Run the application using `mvn spring-boot:run` or by running the `Application` class directly from your IDE.

Open http://localhost:8080/ in your browser.

If you want to run the application locally in the production mode, run `mvn spring-boot:run -Pproduction`.

To run Integration Tests, execute `mvn verify -Pintegration-tests`.

## More Information

- [Vaadin Flow](https://vaadin.com/flow) documentation
- [Using Vaadin and Spring](https://vaadin.com/docs/v14/flow/spring/tutorial-spring-basic.html) article

