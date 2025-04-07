# 📘 **What is `pom.xml`?**

`pom.xml` stands for **Project Object Model**. It is the **core configuration file** for any Maven project.

It tells Maven:
- What the project is,
- What its **dependencies** are,
- How to build it,
- What plugins to use,
- Which versions of libraries or Java to use, and more.

Think of `pom.xml` as the **brain** of your Maven project.

---

## 🧱 **Basic Structure of a `pom.xml` File**

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"  
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0  
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">  
  
    <modelVersion>4.0.0</modelVersion>  
  
    <groupId>com.ednue</groupId>  
    <artifactId>spring-core-app</artifactId>  
    <version>1.0-SNAPSHOT</version>  
  
</project>
```

---

## 🔍 **Explanation of Key Tags**

### 1. `<modelVersion>`
- Defines the version of the POM model being used.
- Always use `4.0.0` (current standard).

### 2. `<groupId>`
- Represents the **company or organization** (reverse domain name style).
- Example: `com.ednue`, `org.springframework`.

### 3. `<artifactId>`
- Unique ID/name for the **project or module**.
- Example: `spring-core-app`, `user-service`.

### 4. `<version>`
- Version of your project/module.
- Common formats:  
  - `1.0.0` (Release)  
  - `1.0-SNAPSHOT` (Still in development)

### 5. `<packaging>`
- Specifies the package type (jar, war, ear).
- Default is `jar`.

---

## 🔗 **Dependencies Section**

Used to import external libraries (like Spring, MySQL, Hibernate, etc.)

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.3.30</version>
    </dependency>
</dependencies>
```

📝 **No need to download JARs manually** – Maven fetches them automatically from its repository!

---

## 🔌 **Plugins Section**

Used for customizing the build process, like compiling Java code, creating a JAR, WAR, running tests, etc.

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.8.1</version>
      <configuration>
        <source>1.8</source>
        <target>1.8</target>
        <includes>
            <include>**/*.java</include>
        </includes>
        <excludes>
            <exclude>**/Test*.java</exclude>
        </excludes>
        <goals>
            <goal>compile</goal>
        </goals>
      </configuration>
    </plugin>
  </plugins>
</build>
```

### 🔹 `goals`
- Specific tasks that a plugin performs (e.g., `compile`, `test`, `package`).

### 🔹 `includes` / `excludes`
- Used to include/exclude specific files during compilation or packaging.
- Uses Ant-style patterns like `**/*.java`, `**/Test*.java`, etc.

---

## 📦 **Repositories Section**

Maven uses **Central Repository** by default, but we can specify **custom repositories**:

```xml
<repositories>
  <repository>
    <id>spring-repo</id>
    <url>https://repo.spring.io/release</url>
  </repository>
</repositories>
```

---

## 💼 **Properties Section**

To define reusable values like Java version:

```xml
<properties>
    <java.version>17</java.version>
</properties>
```

---

## 🧠 **Advanced Tags**

| Tag | Purpose |
|-----|---------|
| `<parent>` | Inherit from a parent POM (like Spring Boot starter) |
| `<modules>` | For multi-module projects |
| `<profiles>` | Define different build configurations (e.g., dev/test/prod) |
| `<dependencyManagement>` | Central control of dependency versions across modules |

---

## 📊 Real Example – Spring Boot App POM

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" ...>

    <modelVersion>4.0.0</modelVersion>
    <groupId>com.ednue</groupId>
    <artifactId>invoice-app</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.1.4</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
    </dependencies>

    <properties>
        <java.version>17</java.version>
    </properties>

</project>
```

---

## ✅ Summary

| Feature | Benefit |
|--------|---------|
| Centralized config | One file for all setup |
| Dependency management | Auto-download JARs |
| Plugin integration | Compile, test, package easily |
| Build automation | Clean, compile, install with one command (`mvn clean install`) |

---