# TODO:

## SESSION 0: BASIC
- [x] REST
- [x] Service Layer
- [x] Repository Layer
- [x] H2 or HSQLDB (In-memory DB)
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
  + BaseRepositoryInterface
  + BaseServiceInterface
  + BaseControlllerInterface
- [x] Helper
- [ ] JPA
- [ ] MongoDB (NoSQL)
- [ ] HATEOAS
- [ ] OAuth2
- [ ] JWT
- [ ] Custom response data {status_code, message, data}
- [ ] Live Reload

## SESSION 1: INTERMEDIATE
- [ ] Async
- [ ] Cache
- [ ] Session & Cookie
- [ ] Multi-language
- [ ] Mail
- [ ] Task scheduling
- [ ] File storage
- [ ] Mocking
- [ ] Multiple database

## SESSION 2: ADVANCE
- [ ] DDD

## SESSION 3: 3RD PARTY
- [ ] Swagger
- [ ] Hibernate
- [x] SLF4J (Simple Logging Facade for Java)
- Lombok
- Liquibase or Flyway
- ModelMapper
- JUnit

---
***
___

## RUN LOCALLY
- Create database first
- Dev:  ```mvn spring-boot:run -Dspring.profiles.active=dev```
- Dev2: ```mvn spring-boot:run -Dspring.profiles.active=dev2```
- Prod: ```mvn spring-boot:run -Dspring.profiles.active=prod```

## Maven: Manage version multiple module
- Only update version child module depend on its parent (Recommended)
```mvn -N versions:update-child-modules```

- Update parent & child module
```mvn versions:set -DnewVersion=2.0-SNAPSHOT```