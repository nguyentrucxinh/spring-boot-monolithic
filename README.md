# TODO:

## SESSION 0: BASIC
- [x] REST
- [x] Service
- [x] Repository
- [x] H2
- [x] MySQL
- [x] Migrations
- [x] Seeding
- [x] Manage version
- [x] Spring profile
- [x] Logging
- [x] Paging
- [x] Sorting
- [x] Transaction
- [ ] @ManyToOne, @ManyToMany, @OneToMany, @OneToOne
- [ ] JPA
- [ ] MongoDB
- [ ] HATEOAS
- [ ] OAuth2
- [ ] JWT

## SESSION 1: INTERMEDIATE
- [ ] Cache
- [ ] Session & Cookie
- [ ] Multi-language
- [ ] Mail
- [ ] Task scheduling
- [ ] File storage
- [ ] Mocking

## SESSION 2: ADVANCE

## SESSION 3: 3RD PARTY
- [ ] Swagger
- [ ] Hibernate
- [x] SLF4J (Simple Logging Facade for Java)

---
***
___

## RUN LOCALLY
- Create database first
- Dev: ```mvn spring-boot:run -Dspring.profiles.active=dev```
- Prod: ```mvn spring-boot:run -Dspring.profiles.active=prod```

## Maven: Manage version multiple module
- Only update version child module depend on its parent (Recommended)
```mvn -N versions:update-child-modules```

- Update parent & child module
```mvn versions:set -DnewVersion=2.0-SNAPSHOT```