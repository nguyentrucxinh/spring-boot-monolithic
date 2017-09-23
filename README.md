# TODO:
- [x] REST
- [x] Service
- [x] Repository
- [x] H2
- [x] MySQL
- [x] Migrations
- [x] Seeding
- [x] Manage version
- [x] Spring profile
- [ ] JPA
- [ ] MongoDB
- [ ] Logging
- [ ] HATEOAS
- [ ] OAuth2
- [ ] JWT

# NEXT: 
- [ ] Cache
- [ ] Session & Cookie
- [ ] Multi-language
- [ ] Mail
- [ ] Task scheduling
- [ ] File storage
- [ ] Mocking

# 3RD PARTY:
- [ ] Swagger
- [ ] Hibernate
- [ ] SLF4J (Simple Logging Facade for Java)

# Run project
- Create database first
- Dev: ```mvn spring-boot:run -Dspring.profiles.active=dev```
- Prod: ```mvn spring-boot:run -Dspring.profiles.active=production```

# Update paren version maven
- Update parent & child module
```mvn versions:set -DnewVersion=2.0-SNAPSHOT```

- Only update version child module depend on its parent
```mvn -N versions:update-child-modules```