# 🌐 Spring Boot - REST API Development

## ✅ What is a REST API?
REST (Representational State Transfer) is an architectural style that allows communication between client and server over HTTP. A REST API allows applications to access and manipulate data using standard HTTP methods like GET, POST, PUT, DELETE.

---

## ⚙️ Building a REST API with Spring Boot

Spring Boot simplifies the development of REST APIs by providing built-in support for:
- REST controllers
- Auto-configuration
- Embedded Tomcat server
- Data binding & validation

---

## 📁 Project Structure
```
com.example.demo
├── controller
│   └── UserController.java
├── model
│   └── User.java
├── service
│   └── UserService.java
├── repository
│   └── UserRepository.java
└── DemoApplication.java
```

---

## 📦 Maven Dependency
Add the following in `pom.xml`:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

---

## ✍️ Create a REST Controller
```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
```

---

## 🧩 Model Class
```java
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    // Getters and Setters
}
```

---

## 🔄 Service Layer
```java
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User updatedUser) {
        User existing = userRepository.findById(id).orElseThrow();
        existing.setName(updatedUser.getName());
        existing.setEmail(updatedUser.getEmail());
        return userRepository.save(existing);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
```

---

## 🗃️ Repository Layer
```java
public interface UserRepository extends JpaRepository<User, Long> {}
```

---

## 🧪 Testing the API
Use **Postman** or **cURL** to test these endpoints:
- `GET /api/users`
- `POST /api/users`
- `PUT /api/users/{id}`
- `DELETE /api/users/{id}`

---

## 📚 Summary
| HTTP Method | Endpoint            | Description        |
|-------------|---------------------|--------------------|
| GET         | /api/users          | Get all users      |
| POST        | /api/users          | Create new user    |
| PUT         | /api/users/{id}     | Update user by ID  |
| DELETE      | /api/users/{id}     | Delete user by ID  |

---

## 🔄 Flow of REST API Development
1. **Client makes a request** (e.g., GET/POST/PUT/DELETE request from Postman, frontend, or another service).
2. **Controller receives the request** and forwards it to the **Service layer**.
3. **Service Layer processes business logic** and interacts with the **Repository layer**.
4. **Repository interacts with the Database** to fetch/store/update data.
5. **Response is sent back to the client**.

---

## 🔍 Understanding Key Components

### 1️⃣ **Controller Layer** (`@RestController`)
- Handles HTTP requests.
- Calls the appropriate service methods.
- Returns data as JSON.

### 2️⃣ **Service Layer** (`@Service`)
- Contains business logic.
- Calls the Repository to retrieve/update data.
- Decouples Controller and Repository.

### 3️⃣ **Repository Layer** (`@Repository`)
- Directly interacts with the database.
- Uses JPA/Hibernate for database operations.

### 4️⃣ **Entity Class** (`@Entity`)
- Represents a table in the database.
- Mapped using JPA annotations.

### 5️⃣ **DTO (Data Transfer Object)**
- Used to transfer data between layers.
- Avoids exposing the entity directly.
- Example: `UserDTO` with only necessary fields.

### 6️⃣ **DAO (Data Access Object)**
- A pattern to encapsulate database operations.
- Used in some projects instead of repositories.

### 7️⃣ **POJO (Plain Old Java Object)**
- A simple Java class with getters and setters.
- Used to model objects without special annotations.

### 8️⃣ **Model Class**
- Similar to POJO but typically used for business models.

**🔄 Overlaps:**
- **Entity, Model, and POJO** are often similar.
- **DTO is used to restrict data exposure.**
- **DAO and Repository both interact with the database but DAO is more manually implemented.**

---