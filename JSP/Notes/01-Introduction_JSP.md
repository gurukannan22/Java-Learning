# **Java Servlets - Complete Guide**  

### **1️⃣ Introduction to Servlets**  
Servlets are **Java programs** that run on a web server to handle **HTTP requests and responses**. They are the backbone of **dynamic Java web applications**.

✅ **Key Features:**  
✔️ Runs on a **Java EE-compliant server** like Tomcat  
✔️ Handles **form submissions, session management, and database operations**  
✔️ Uses **`web.xml` for deployment configuration**  
✔️ Provides **lifecycle methods** (`init()`, `service()`, `destroy()`)  

---

# **2️⃣ Installing Apache Tomcat (Servlet Server)**  
To run Servlets, we need **Apache Tomcat**.

## **🔹 Step 1: Download Apache Tomcat**  
1️⃣ Go to **[Apache Tomcat Official Website](https://tomcat.apache.org/)**  
2️⃣ Choose **Tomcat 9 or 10**  
3️⃣ Download the **Windows Service Installer** or **ZIP File**  

## **🔹 Step 2: Install & Set Up Tomcat**  
✔️ If using **Windows Installer**, run the `.exe` and complete the setup.  
✔️ If using **ZIP file**, extract and move it to `C:\tomcat`.  

## **🔹 Step 3: Configure Environment Variables**  
1️⃣ **Set JAVA_HOME** (in System Properties > Advanced > Environment Variables)  
2️⃣ **Add Tomcat to Path** (`C:\tomcat\bin`)  

## **🔹 Step 4: Start Tomcat Server**  
✔️ Run `startup.bat` (Windows) or `startup.sh` (Mac/Linux).  
✔️ Open browser and visit `http://localhost:8080` to check if Tomcat is running. ✅  

---

# **3️⃣ Creating Your First Servlet**  

## **🔹 Step 1: Create a Web Application Structure**  
Inside `webapps`, create:  
```
C:\tomcat\webapps\MyServletApp\
├── index.html
├── WEB-INF\
│   ├── web.xml
│   ├── classes\ (Compiled Servlets)
└── src\
    ├── MyServlet.java
```

## **🔹 Step 2: Write a Simple Servlet**  
📌 **File:** `MyServlet.java`  
```java
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h2>Welcome to Servlets!</h2>");
    }
}
```

## **🔹 Step 3: Configure `web.xml` (Servlet Mapping)**  
📌 **File:** `WEB-INF/web.xml`  
```xml
<web-app xmlns="http://java.sun.com/xml/ns/javaee" version="3.0">
    <servlet>
        <servlet-name>MyServlet</servlet-name>
        <servlet-class>MyServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>MyServlet</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
</web-app>
```

## **🔹 Step 4: Deploy & Run the Servlet**  
✔️ Compile the Java file (`javac -cp tomcat/lib/servlet-api.jar -d WEB-INF/classes src/MyServlet.java`)  
✔️ Copy `MyServletApp` to `C:\tomcat\webapps\`  
✔️ Restart Tomcat  
✔️ Open browser and visit 👉 `http://localhost:8080/MyServletApp/hello`  

✅ **Servlet is now running!**  

---

# **4️⃣ Handling Requests & Responses**  

## **🔹 Reading Request Parameters**  
```java
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("username");
    response.getWriter().println("Hello, " + name + "!");
}
```

## **🔹 Sending Response Data**  
```java
response.setContentType("text/html");
response.getWriter().println("<h1>Servlet Response Example</h1>");
```

---

# **5️⃣ Connecting Servlets with HTML Forms**  
📌 **File:** `index.html`  
```html
<form action="hello" method="post">
    Name: <input type="text" name="username">
    <input type="submit" value="Submit">
</form>
```

---

# **6️⃣ Session Management & Cookies**  

## **🔹 Managing Sessions**  
```java
HttpSession session = request.getSession();
session.setAttribute("user", "John");
String user = (String) session.getAttribute("user");
```

## **🔹 Working with Cookies**  
```java
Cookie cookie = new Cookie("username", "John");
cookie.setMaxAge(60*60);
response.addCookie(cookie);
```

---

# **7️⃣ JSP (Optional for View Layer)**  
While Servlets handle business logic, JSP can be used for the **view layer**.

📌 **Example JSP File:** `index.jsp`
```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Servlet & JSP Example</title></head>
<body>
    <h2>Welcome, <%= request.getParameter("username") %>!</h2>
</body>
</html>
```

---

# **Conclusion**  
✅ **Servlets** power **dynamic Java web applications**  
✅ **Uses `web.xml` for configuration**  
✅ **Handles form data, sessions, and cookies**  
✅ **JSP can be added as a frontend for Servlets**  

