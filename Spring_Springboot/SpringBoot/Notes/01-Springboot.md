# 📌 What is Spring Boot?
Spring Boot is an extension of the Spring Framework that simplifies the setup, configuration, and deployment of Spring applications. It allows developers to create stand-alone, production-grade Spring-based applications with minimal configuration.

**Key Goals of Spring Boot:**
- Reduce boilerplate code
- Provide embedded servers (Tomcat, Jetty, etc.)
- Automatically configure Spring components
- Create production-ready apps quickly

---

### ⚖️ Spring vs Spring Boot

| Feature | Spring Framework | Spring Boot |
|--------|------------------|-------------|
| Configuration | Manual, XML/Java-based | Auto Configuration |
| Dependency Management | Manual via `pom.xml` | Starter POMs (predefined sets of dependencies) |
| Web Server | Requires external deployment (WAR) | Embedded servers (e.g., Tomcat) |
| Entry Point | No default | `@SpringBootApplication` with main method |
| Development Speed | Slower setup | Faster and easier setup |

---

### 🌟 Features of Spring Boot
- Auto-configuration
- Embedded web servers
- Production-ready with built-in metrics and health checks
- Spring Boot Starters for quick dependency management
- Easy integration with databases and cloud services
- Minimal Spring XML configuration

---

### 🧠 Annotations in Spring Boot

| Annotation | Description |
|-----------|-------------|
| `@SpringBootApplication` | Combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan` |
| `@RestController` | Marks a class as a REST API controller |
| `@RequestMapping` | Maps HTTP requests to handler methods |
| `@Autowired` | Automatically injects dependencies |
| `@Value` | Injects values from application properties |

---

### 🗂️ Spring Boot Starter Dependencies
Starters are dependency descriptors that group common dependencies into one. Example:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

Some common starters:
- `spring-boot-starter-web`
- `spring-boot-starter-data-jpa`
- `spring-boot-starter-security`
- `spring-boot-starter-test`

---

### ⚙️ Embedded Server Support
Spring Boot supports running apps with built-in servers like:
- Tomcat (default)
- Jetty
- Undertow

No need to deploy WAR files – just run the JAR directly:
```bash
java -jar appname.jar
```

---

### 📄 application.properties / application.yml
Used to configure various settings like:
```properties
server.port=8081
datasource.url=jdbc:mysql://localhost:3306/mydb
spring.jpa.show-sql=true
```

---

### 🔁 Spring Boot DevTools
Hot reloading feature that enables quick development:
```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-devtools</artifactId>
  <optional>true</optional>
</dependency>
```

---

### ✅ Summary
- Spring Boot simplifies Spring development.
- Offers embedded servers, autoconfiguration, and production-ready tools.
- Reduces the time and effort needed to build applications.
