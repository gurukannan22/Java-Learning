# 🔧 **Spring Autowiring**

Autowiring in Spring allows **automatic injection of dependencies** without explicitly specifying them in configuration.

---

### 🔹 **1️⃣ What is Autowiring?**

Autowiring automatically connects collaborating beans, reducing the need for `<property>` or setter methods in XML or manual injection in Java code.

---

### 🔹 **2️⃣ Autowiring Modes in Spring XML**

| Mode | Description |
|------|-------------|
| `no` | Default. No autowiring. Dependencies must be set manually. |
| `byName` | Injects the dependency by matching the property name with the bean name. |
| `byType` | Injects dependency by matching the property type with the bean class. |
| `constructor` | Injects dependency using a constructor. |
| `autodetect` *(deprecated)* | Uses constructor or byType automatically (discouraged). |

**Example – byName:**
```xml
<bean id="car" class="com.example.Car" autowire="byName"/>
<bean id="engine" class="com.example.Engine"/>
```

---

### 🔹 **3️⃣ Annotation-based Autowiring**

**✅ Using `@Autowired`:**

```java
@Component
public class Car {
    
    @Autowired
    private Engine engine;

    // or use constructor injection
    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }
}
```

You can use `@Autowired` on:
- Fields
- Setters
- Constructors

---

### 🔹 **4️⃣ `@Qualifier` Annotation**

Used when multiple beans of the same type exist and Spring doesn’t know which one to inject.

```java
@Autowired
@Qualifier("dieselEngine")
private Engine engine;
```

---

### 🔹 **5️⃣ Required vs Optional Dependency**

By default, `@Autowired` expects the dependency to exist. To make it optional:

```java
@Autowired(required = false)
private MusicSystem musicSystem;
```

---

### ✅ **Summary**

- Autowiring simplifies dependency injection.
- Prefer **annotation-based autowiring** for modern Spring apps.
- Use `@Qualifier` to resolve conflicts when multiple beans match.

---