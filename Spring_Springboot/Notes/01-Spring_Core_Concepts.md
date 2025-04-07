# 🌱 Spring Framework - Core Concepts


## ✅ What is Spring?
Spring is a powerful, lightweight **Java framework** for building enterprise-grade applications. It provides comprehensive infrastructure support for developing Java applications quickly and easily.

It promotes good design practices such as **loose coupling**, **dependency injection**, and **separation of concerns**.

---

## 🆚 How is Spring Different from a Normal Java Application?
| Aspect | Normal Java Application | Spring Framework Application |
|--------|--------------------------|-------------------------------|
| Object creation | Manually handled using `new` keyword | Managed by Spring's IoC Container |
| Dependency management | Developer manages dependencies | Spring injects dependencies automatically |
| Configuration | Hardcoded or scattered across the code | Centralized via XML, Annotations, or Java Config |
| Scalability & modularity | Low | High - loosely coupled components |
| Built-in tools | Limited | Offers built-in modules like Spring MVC, Spring JDBC, etc. |

---

## 🌟 Features of Spring
- ✅ Lightweight and modular
- ✅ Dependency Injection (DI)
- ✅ Aspect-Oriented Programming (AOP)
- ✅ MVC web framework (Spring MVC)
- ✅ Transaction Management
- ✅ Integration with frameworks like Hibernate, JPA, JMS
- ✅ Security and Testing support
- ✅ Container management via IoC

---

## 🧠 Spring IoC (Inversion of Control) Container
The IoC container is the **core** of the Spring Framework. It manages the complete **life cycle of beans (objects)**, from instantiation to destruction.

- **Bean**: An object managed by the Spring container
- **IoC**: The control of creating and managing objects is inverted from the program to the container

Spring provides two types of containers:
1. `BeanFactory`: Lightweight container, slower
2. `ApplicationContext`: Advanced container with more features (used widely)

---

## 🧩 Dependency Injection (DI)
Dependency Injection is a design pattern used to remove the hard-coded dependencies and make the application loosely coupled.

In Spring, DI can be done in two ways:
- **Constructor Injection**
- **Setter Injection**

Spring automatically injects dependencies defined in configuration.

---

## 🛠 XML-based Configuration
In this approach, we define beans and dependencies using an XML file.

**Example:**
```xml
<bean id="student" class="com.example.Student">
    <property name="name" value="John" />
</bean>
```

Load using `ApplicationContext`:
```java
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
Student s = context.getBean("student", Student.class);
```

---

## 🧾 Java-based Configuration
Introduced in Spring 3.x, Java-based configuration uses **`@Configuration`** and **`@Bean`** annotations.

**Example:**
```java
@Configuration
public class AppConfig {
    @Bean
    public Student student() {
        return new Student("John");
    }
}
```

```java
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
Student s = context.getBean(Student.class);
```

---

## 🏷️ Annotation-based Configuration
Spring supports annotations to reduce configuration overhead.

**Common Annotations:**
- `@Component` - Marks class as bean
- `@Autowired` - Injects dependencies automatically
- `@Controller`, `@Service`, `@Repository` - Specialized components

**Example:**
```java
@Component
public class Student {
    @Autowired
    private Address address;
}
```

**Enable component scanning:**
```xml
<context:component-scan base-package="com.example" />
```

OR
```java
@ComponentScan("com.example")
```

---

