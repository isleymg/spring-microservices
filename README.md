# spring-microservices

Discovery service: Eureka
- service registry where all running services are listed
Load balancing: Feign
- client-side load balancing
- actual implementation is provisioned by Feign at runtime, developer only needs to declare and annotate an interface
Configuration: Config server
- Run config project to set up configuration server pointing to my github repo with config files
Circuit issues: Hystrix
- handles circuit issues and stops failures, provides fallback options
API Management: Zuul
 - proxies and filters request for microservice
 - 'pre' filter used to execute before request is routed
 - can also use 'route', 'post', 'error'
 - architecture of Zuul filter is COMMAND pattern, where there is the function run() inside a class
