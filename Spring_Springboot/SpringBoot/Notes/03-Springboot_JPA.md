# 🗂️ Spring Boot JPA, Hibernate, and ORM

## 🔍 What is Spring Data JPA?
Spring Data JPA is part of Spring Data project that simplifies data access layers. It provides abstraction over JPA and Hibernate.

## ⚙️ What is JPA?
- JPA (Java Persistence API) is a specification for ORM in Java.
- It's not a framework, but an interface.
- Hibernate is the most popular JPA implementation.

## 🔧 What is Hibernate?
- Hibernate is an ORM (Object Relational Mapping) tool.
- It maps Java objects to relational database tables.
- Automatically generates SQL queries.

## 📘 What is ORM?
- ORM maps data between Java objects and database tables.
- It eliminates boilerplate JDBC code.
- Manages relationships, transactions, and lazy/eager loading.

## ⚡ Benefits of Spring Data JPA:
- Reduces boilerplate code using CRUDRepository / JpaRepository.
- Pagination and sorting built-in.
- Custom queries with method names or `@Query`.

## 🔍 Example Repository
```java
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}
```

## 🧠 Key Terms
- **Entity**: Java class mapped to a DB table
- **Table**: Actual table in the DB
- **@Entity**: JPA annotation to mark class as persistent
- **@Id**: Marks the primary key
- **@GeneratedValue**: Auto-generates primary key values

## ⚙️ application.properties example
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
```
---