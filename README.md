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
- Server:
  + [x] Tomcat (Replace to Jetty)
  + [ ] Tomcat EE
  + [x] Jetty
  + [ ] WildFly
  + [ ] GlassFish

- Bean Mapping
  + [x] Mapstruct (Removed cause must rebuild it to get implement class every run) 
  + [x] Mapper of Spring Framework `org.springframework.beans.BeanUtils` (Removed cause it very simple) 
  + [x] ModelMapper
 
- Logging:
  + [x] SLF4J (Simple Logging Facade for Java)
  + [ ] Log4j
  + [ ] Logback
  
- JSON
  + [x] Jackson

- Code Generators
  + [x] Lombok

- Testing
  + [ ] JUnit
  + [ ] Arquillian
  + [ ] Mockito

- Utility
  + [ ] Guava

- Web Crawling
  + [ ] JSoup

- [ ] Higher-level database migration tool
  + [ ] Liquibase
  + [ ] Flyway
  
- [x] Swagger

- ORM
  + [ ] Hibernate

- Search
  + [ ] Elasticsearch
  + [ ] Apache Solr

- Caching
  + [ ] EhCache
 
- [ ] Joda DateTime
- [ ] RabbitMQ (message broker)
- [ ] Redis (in-memory data structure store, used as a database, cache and message broker)
- [ ] LDAP (Lightweight Directory Access Protocol)

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
- Dev:  ```mvn spring-boot:run```
- Dev2: ```mvn spring-boot:run -Dspring.profiles.active=dev2```
- Prod: ```mvn spring-boot:run -Dspring.profiles.active=prod```

## ACCESS LINK
- Swagger:
  + http://localhost:8080/docs
  + http://localhost:8080/swagger-ui.html
- Actuator:
  + http://localhost:8080/health
  + http://localhost:8080/info