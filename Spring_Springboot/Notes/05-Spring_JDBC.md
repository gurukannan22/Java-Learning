#🌱 **Spring JDBC (Java Database Connectivity)**

Spring JDBC simplifies database operations like connecting, querying, and updating by **eliminating boilerplate code**.

---

### 🔹 **1️⃣ What is Spring JDBC?**

Spring JDBC is a **JDBC abstraction layer** that simplifies interactions with relational databases using Java’s standard JDBC API, but with **reduced complexity**.

---

### 🔹 **2️⃣ Why Use Spring JDBC Over Plain JDBC?**

| Plain JDBC | Spring JDBC |
|------------|--------------|
| Manual connection handling | Automatic connection handling |
| Manual statement & result set closing | Auto-closing via Spring |
| Lots of try-catch-finally | Cleaner code with exceptions managed |
| Error-prone | Less error-prone and more readable |

---

### 🔹 **3️⃣ Spring JDBC Core Components**

| Component | Description |
|----------|-------------|
| `JdbcTemplate` | Central class for JDBC operations |
| `DataSource` | Interface to obtain DB connections |
| `RowMapper` | Maps rows of a ResultSet to Java objects |
| `NamedParameterJdbcTemplate` | Template that supports named parameters |

---

### 🔹 **4️⃣ Spring JDBC Setup (Java-Based Configuration)**

#### Step 1: Add Dependencies (Maven)
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.x.x</version>
</dependency>

<!-- For MySQL -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.x.x</version>
</dependency>
```

#### Step 2: Configure DataSource and JdbcTemplate
```java
@Configuration
public class JdbcConfig {
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/ednuedb");
        ds.setUsername("root");
        ds.setPassword("password");
        return ds;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }
}
```

---

### 🔹 **5️⃣ Example: CRUD with JdbcTemplate**

#### Student.java (POJO)
```java
public class Student {
    private int id;
    private String name;
    private String city;
    // Getters & Setters
}
```

#### StudentDao.java
```java
public interface StudentDao {
    int insert(Student student);
    int update(Student student);
    int delete(int studentId);
    Student getStudent(int studentId);
    List<Student> getAllStudents();
}
```

#### StudentDaoImpl.java
```java
@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(Student student) {
        String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";
        return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    public int update(Student student) {
        String query = "UPDATE student SET name=?, city=? WHERE id=?";
        return jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
    }

    public int delete(int studentId) {
        String query = "DELETE FROM student WHERE id=?";
        return jdbcTemplate.update(query, studentId);
    }

    public Student getStudent(int studentId) {
        String query = "SELECT * FROM student WHERE id=?";
        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Student.class), studentId);
    }

    public List<Student> getAllStudents() {
        String query = "SELECT * FROM student";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Student.class));
    }
}
```

---

### ✅ Summary

- `JdbcTemplate` simplifies query execution and resource management.
- Avoids boilerplate code of `try-catch-finally`.
- Works well for simple CRUD operations and small-scale applications.

---