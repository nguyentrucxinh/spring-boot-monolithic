# TODO:

## SESSION 0: BASIC
- [x] REST
- [x] Service Layer
- [x] Repository Layer
- [ ] In-memory database
  + [x] H2
  + [ ] HSQLDB
- [x] MySQL (RDBMS)
- [x] Migrations
- [x] Seeding
- [x] Maven: Manage version modules
- [x] Spring profile (dev & prod)
- [x] Logging
- [x] Paging
- [x] Sorting
- [x] Transaction
- [ ] Association Mapping (@ManyToOne, @ManyToMany, @OneToMany, @OneToOne)
  + [x] Unidirectional
  + [ ] Bidirectional
- [x] Annotation Validate
- [x] YAML (yml)
- [x] Create Base
  + BaseEntity
  + BaseRepository
  + BaseService
  + BaseController
- [x] Helper: Util & Bean
- [x] Custom response data {status_code, message, data, ...}
- [x] JPA
- [x] Live Reload (spring-boot-devtools) (Removed to get more performance when coding)
- [x] Get property from application.yml (application.properties) (@Value & Environment)
- [x] Validation groups
- [x] Jackson @JsonView (multiple view)
- [x] Jackson @JsonProperty
- [ ] MongoDB (NoSQL)
- [ ] HATEOAS
- [ ] OAuth2
- [ ] JWT

## SESSION 1: INTERMEDIATE
- [ ] Async
- [ ] Cache
- [ ] Session & Cookie
- [ ] Multi-language
- [ ] Mail
- [ ] Task scheduling
- [ ] File storage
- [ ] Mocking
- [ ] Multiple database (eg: Multiple MySQL, ...)

## SESSION 2: ADVANCE
- [ ] DDD

## SESSION 3: 3RD PARTY
- Bean Mapping:
  + [x] Mapstruct (Removed cause must rebuild it to get implement class every run) 
  + [x] Mapper of Spring Framework `org.springframework.beans.BeanUtils` (Removed cause it very simple)
  + [x] Mapper of Apache `BeanUtils` 
  + [x] ModelMapper
  + [ ] Dozer
  + [ ] Orika

- Build:
  + [x] Maven
  + [ ] Gradle 

- Server:
  + [x] Tomcat (Replace to Jetty)
  + [x] Jetty
 
- Logging:
  + [x] SLF4J (Simple Logging Facade for Java)
  
- JSON:
  + [x] Jackson

- Code Generators:
  + [x] Lombok

- Document Processing:
  + [x] Swagger

- Database tool:
  + [ ] Liquibase
  + [ ] Flyway

- ORM:
  + [ ] Hibernate
  + [ ] Cache Level Hibernate

- Testing:
  + [ ] JUnit
  + [ ] Arquillian
  + [ ] Mockito

- [ ] Joda DateTime

- Utility:
  + [ ] Guava

- Web Crawling:
  + [ ] JSoup

- Search:
  + [ ] Elasticsearch
  + [ ] Apache Solr

- Microservice:
  + [ ] Apollo
  + [ ] consul-api
  + [ ] Eureka
  + [ ] Lagom
  + [ ] Hystrix 
  + [ ] Zuul  
  
---
***
___

## Maven: Manage version multiple module
- Only update version child module depend on its parent (Recommended)
```mvn -N versions:update-child-modules```

- Update parent & child module
```mvn versions:set -DnewVersion=2.0-SNAPSHOT```

## RUN LOCALLY
- Create database first
- h2:  ```mvn spring-boot:run```
- Dev: ```mvn spring-boot:run -Dspring.profiles.active=dev```
- Prod: ```mvn spring-boot:run -Dspring.profiles.active=prod```

## ACCESS LINK
- Swagger:
  + http://localhost:8080/docs
  + http://localhost:8080/swagger-ui.html
- Actuator:
  + http://localhost:8080/health
  + http://localhost:8080/info
- H2 console:
  + http://localhost:8080/h2-console