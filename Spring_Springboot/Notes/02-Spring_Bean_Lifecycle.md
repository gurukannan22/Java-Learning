# 🔄 **Spring Bean Lifecycle (FOr Theory Only)**

Spring manages the lifecycle of beans from creation to destruction. Understanding the bean lifecycle is essential for managing resources and application behavior.

---

#### 🧬 **Lifecycle Phases**

1. **Instantiation**
   - Spring creates an instance of the bean using a no-arg constructor.

2. **Populate Properties (Dependency Injection)**
   - Dependencies are injected via setter or constructor injection.

3. **BeanNameAware & BeanFactoryAware**
   - Spring calls interfaces like `BeanNameAware`, `BeanFactoryAware` if implemented.

4. **Post-Initialization (BeanPostProcessor)**
   - Custom logic before and after initialization using `BeanPostProcessor`.

5. **Initialization (Custom init methods)**
   - Spring calls `afterPropertiesSet()` (from `InitializingBean`) or a custom `init-method`.

6. **Ready to Use**
   - Bean is fully initialized and ready to be used in the application.

7. **Destruction**
   - When the container is closed, Spring calls `destroy()` (from `DisposableBean`) or a custom `destroy-method`.

---

#### 🧪 **Example Using XML Configuration**

```xml
<bean id="exampleBean" class="com.example.MyBean" 
      init-method="init" destroy-method="cleanup"/>
```

```java
public class MyBean {
    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void cleanup() {
        System.out.println("Bean will be destroyed now.");
    }
}
```

---

#### 📌 **Important Interfaces**

| Interface | Method | Purpose |
|----------|--------|---------|
| `InitializingBean` | `afterPropertiesSet()` | Logic after properties set |
| `DisposableBean` | `destroy()` | Cleanup logic before destruction |
| `BeanPostProcessor` | `postProcessBeforeInitialization()`, `postProcessAfterInitialization()` | Intercepts bean initialization |

---