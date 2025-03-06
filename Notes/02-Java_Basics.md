# **Introduction to Java**  
Java is a high-level, object-oriented programming language known for its **platform independence (Write Once, Run Anywhere - WORA)** and strong community support.  

### **Key Features of Java**  
✅ Simple and Easy to Learn  
✅ Object-Oriented Programming (OOP)  
✅ Platform Independent (Runs on JVM)  
✅ Automatic Memory Management (Garbage Collection)  
✅ Secure and Scalable  

---

## **Basic Java Syntax**  

### **1️⃣ Writing Your First Java Program**  
Create a new file called **HelloWorld.java** and add the following code:  

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### **2️⃣ Understanding the Code**  
- `public class HelloWorld` → Defines a class named `HelloWorld`.  
- `public static void main(String[] args)` → Main method where execution starts.  
- `System.out.println("Hello, Java!");` → Prints output to the console.  

---

### **3️⃣ Comments in Java**  
Comments are used to explain code and make it more readable. Java supports:  

1️⃣ **Single-line comments (`//`)**  
```java
// This is a single-line comment
int x = 10;  // This is another single-line comment
```

2️⃣ **Multi-line comments (`/* ... */`)**  
```java
/*
 This is a multi-line comment.
 It can span multiple lines.
*/
int y = 20;
```

3️⃣ **Javadoc comments (`/** ... */`)** - Used for documentation  
```java
/**
 * This is a Javadoc comment.
 * It is used to generate documentation for Java classes and methods.
 */
public class Example {
    /**
     * This method prints a message
     */
    public void showMessage() {
        System.out.println("Hello, Java!");
    }
}
```

---

## **4️⃣ Java Variables and Data Types**  
Java is a **statically typed language**, meaning variables must have a specific type.  

### **🔹 Declaring Variables**  
```java
int age = 25;  // Integer
double price = 99.99;  // Decimal
char grade = 'A';  // Single character
boolean isJavaFun = true;  // Boolean value
String name = "Ednue";  // Text (String)
```

### **🔹 Data Types Overview**  
| Data Type  | Description         | Example   |
|------------|---------------------|-----------|
| `int`      | Integer values      | `10, 20`  |
| `double`   | Decimal values      | `10.5, 99.99` |
| `char`     | Single character    | `'A', 'B'` |
| `boolean`  | True/False values   | `true, false` |
| `String`   | Textual data        | `"Java"`  |

---

## **5️⃣ Java Operators**  
Java provides different types of operators:  

### **🔹 Arithmetic Operators**
| Operator | Description | Example |
|----------|------------|---------|
| `+`      | Addition   | `a + b` |
| `-`      | Subtraction | `a - b` |
| `*`      | Multiplication | `a * b` |
| `/`      | Division   | `a / b` |
| `%`      | Modulus (Remainder) | `a % b` |

Example:
```java
int a = 10, b = 5;
System.out.println(a + b);  // Output: 15
System.out.println(a * b);  // Output: 50
```

---