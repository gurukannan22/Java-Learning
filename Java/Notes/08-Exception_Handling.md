# **Exception_Handling**  

## **1️⃣ What is Exception Handling?**  
An **exception** is an **unexpected error** that occurs during program execution, causing it to crash. **Exception Handling** ensures the program runs smoothly by handling errors properly.  

---

## **2️⃣ Types of Exceptions**  
### **Checked vs Unchecked Exceptions**
🔹 **Checked Exceptions** → Must be handled at compile-time (e.g., `IOException`, `SQLException`).  
🔹 **Unchecked Exceptions** → Occur at runtime (e.g., `ArithmeticException`, `NullPointerException`).  

### **Common Exceptions in Java**
| Exception Type            | Description                                |
|---------------------------|--------------------------------------------|
| `ArithmeticException`      | Division by zero (`5/0`)                 |
| `NullPointerException`     | Accessing methods/fields of `null`       |
| `ArrayIndexOutOfBounds`    | Accessing an invalid index in an array   |
| `IOException`              | Error in file operations                 |
| `NumberFormatException`    | Converting invalid string to number      |

---

## **3️⃣ Handling Exceptions using `try-catch`**  
The `try-catch` block is used to handle exceptions gracefully.  

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        System.out.println("Program continues...");
    }
}
```
**Output:**  
```
Error: Cannot divide by zero.  
Program continues...  
```
> **🔹 Note:** Without the `try-catch` block, the program would crash.

---

## **4️⃣ Multiple Catch Blocks**  
A `try` block can have multiple `catch` blocks to handle different types of exceptions.

```java
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds!");
        }
    }
}
```
**Output:**  
```
Array Index Out of Bounds!
```

---

## **5️⃣ Using `finally` Block**  
The `finally` block **always executes** whether an exception occurs or not. Useful for **closing resources** like files and database connections.

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 2;
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
```
**Output:**  
```
Inside try block  
Finally block executed  
```

---

## **6️⃣ Throwing Exceptions using `throw`**  
The `throw` keyword is used to **manually trigger an exception**.

```java
public class ThrowExample {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote!");
        }
        System.out.println("You can vote.");
    }

    public static void main(String[] args) {
        validateAge(15);  // Throws exception
    }
}
```
**Output:**  
```
Exception in thread "main" java.lang.ArithmeticException: Not eligible to vote!
```

---

## **7️⃣ Declaring Exceptions using `throws`**  
The `throws` keyword **declares exceptions** that might be thrown by a method.

```java
import java.io.*;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        file.read();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}
```
**Output:**  
```
File not found.
```

---

## **8️⃣ Custom Exceptions (User-Defined Exceptions)**  
Java allows us to create our **own exceptions** by extending the `Exception` class.

```java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
```
**Output:**  
```
Caught: This is a custom exception
```
The **superclass of all exception classes in Java** is **`java.lang.Throwable`**.

### **Hierarchy of Exception Handling in Java**
```
java.lang.Object
   └── java.lang.Throwable  ← (Super class of all exceptions & errors)
       ├── java.lang.Exception  ← (For recoverable exceptions)
       │   ├── Checked Exceptions (IOException, SQLException, etc.)
       │   └── Unchecked Exceptions (RuntimeException & its subclasses)
       └── java.lang.Error  ← (For non-recoverable system errors)
           ├── OutOfMemoryError
           ├── StackOverflowError
           └── VirtualMachineError
```

### **Key Points about `Throwable`**
- **`Throwable`** is the root class for all exception and error classes.
- It has two direct subclasses:
  - **`Exception`** (used for application-level errors that can be handled)
  - **`Error`** (used for serious system-level issues that are generally unrecoverable)
- Contains important methods like:
  - `getMessage()`
  - `printStackTrace()`
  - `toString()`

---