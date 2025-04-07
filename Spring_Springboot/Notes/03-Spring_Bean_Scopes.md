# 🧪 **Spring Bean Scopes**

Spring provides different scopes for beans to define how and when the objects are created and managed.

---

### 🔹 **1. Singleton (Default)**
- Only **one instance** per Spring container.
- All requests for the bean return the **same object**.

```xml
<bean id="myBean" class="com.example.MyBean" scope="singleton"/>
```

```java
@Component
@Scope("singleton")
public class MyBean { }
```

---

### 🔹 **2. Prototype**
- A **new bean instance** is created **every time** it is requested.

```xml
<bean id="myBean" class="com.example.MyBean" scope="prototype"/>
```

```java
@Component
@Scope("prototype")
public class MyBean { }
```

---

### 🔹 **3. Request** (Web-aware scope)
- **One instance per HTTP request**.
- Works only in **Spring Web** context.

```java
@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class MyBean { }
```

---

### 🔹 **4. Session**
- One instance per **HTTP session**.

```java
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION)
public class MyBean { }
```

---

### 🔹 **5. Application**
- One instance per **ServletContext** (application-wide).

```java
@Component
@Scope(value = WebApplicationContext.SCOPE_APPLICATION)
public class MyBean { }
```

---

### 🔹 **6. Websocket** (Used in messaging/websocket apps)
- One instance per WebSocket.

```java
@Component
@Scope(value = "websocket")
public class MyWebSocketBean { }
```

---

### 🔍 **Summary Table**

| Scope | Description | Scope Type |
|-------|-------------|------------|
| Singleton | One bean per container | Default |
| Prototype | New bean for every request | Non-shared |
| Request | One bean per HTTP request | Web |
| Session | One bean per HTTP session | Web |
| Application | One bean per app context | Web |
| WebSocket | One bean per WebSocket session | Web |

---