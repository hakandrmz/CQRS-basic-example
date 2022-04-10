# CQRS Template

## Technologies:

- AxonServer
- Spring Data JPA
- OpenAPI
- H2 In-memory Database
- Lombok

To run:

1. change directory to project
2. docker run -d --name axonserver -p 8024:8024 -p 8124:8124 axoniq/axonserver
3. mvn spring-boot:run
