# spring-cloud-gateway
spring-cloud-gateway demonstration

## About project
This projects demonstarates how to set up API gateway (reverse proxy) for underlying microservices (down stream servers).
A major benefit of using API gateways is that they allow developers to encapsulate the internal structure of an application in multiple ways, 
depending upon use case. This is because, in addition to accommodating direct requests, gateways can be used to invoke multiple back-end services and aggregate the results.

This project is developed in Spring boot 2

## Project Structure
 * This repository contains 3 projects (Microservice1 , Microservice2 and Gateway)
 * Microservice1 and Microservice2 contails simple rest controller
 * Gateway routes request between Microservice1 and Microservice2 depending on context path in url (application layer reverse proxy).
 

## dependency for spring gateway
 
 ```
 <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-gateway</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
</dependency>
 ```
 
 Hystrix Netflix is required to plug circuit breaker at Gateway level. It can be customized for each microservice with different critiria.
 More detail regarding circuit beaker will be explained in seperate repository
 
 
