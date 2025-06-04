Product Microservice
Overview
This repository contains the Product Microservice, a Spring Boot application designed to interact with Apache Kafka for message-based communication. It is built using Java and Maven.

Features
Spring Boot-based microservice architecture.
Kafka producer and consumer integration.
Configurable Kafka properties via application.properties.
Prerequisites
Java: JDK 11 or higher.
Maven: Version 3.6 or higher.
Apache Kafka: Kafka broker and Zookeeper must be running.
Getting Started
Clone the Repository

git clone https://github.com/mayurthube/product-microservice.git
cd product-microservice
Build the Project
Run the following command to build the project:


mvn clean install
Run the Application
Start the application using:


mvn spring-boot:run
Kafka Configuration
Ensure the Kafka broker is running and update the application.properties file with the correct Kafka server details:


spring.kafka.producer.bootstrap-servers=localhost:9092
spring.kafka.consumer.bootstrap-servers=localhost:9092
Project Structure
src/main/java/com/demo/kafka/product: Contains the main application code.
src/main/resources/application.properties: Configuration file for the application.
pom.xml: Maven dependencies and build configuration.
Dependencies
Spring Boot: Framework for building Java-based microservices.
Spring Kafka: Integration with Apache Kafka.
Maven: Dependency management and build tool.
Troubleshooting
Common Issues
Kafka Connection Error: Ensure the Kafka broker is running and accessible on the configured port.
Application Startup Failure: Verify Java and Maven versions and check the logs for errors.
License
This project is licensed under the MIT License. See the LICENSE file for details.

Author
Mayur Thube

Using 1 Reference
