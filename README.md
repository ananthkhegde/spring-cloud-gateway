# spring-cloud-gateway
spring-cloud-gateway demonstration

## About project
This projects demonstarates how to set up API gateway (reverse proxy) for underlying microservices (down stream servers).
A major benefit of using API gateways is that they allow developers to encapsulate the internal structure of an application in multiple ways, 
depending upon use case. This is because, in addition to accommodating direct requests, gateways can be used to invoke multiple back-end services and aggregate the results.


## dependency
 
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
