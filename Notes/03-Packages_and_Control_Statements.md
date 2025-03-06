# **Packages and Control Statements**  

## **1️⃣ Java Packages**  
A **package** in Java is a way to organize related classes and interfaces. It helps in managing large projects by grouping similar functionalities together.  

### **🔹 Creating a Package**  
1. Define a package at the top of a Java file using the `package` keyword.  
2. Store the file inside a corresponding folder with the package name.  

**Example:**  
```java
// Define a package named 'myPackage'
package myPackage;  

// A simple class inside the package
public class MyClass {
    public void displayMessage() {
        System.out.println("Hello from MyClass in myPackage!");
    }
}
```

### **🔹 Using a Package**  
To use a class from another package, **import** it using the `import` keyword.  

```java
import myPackage.MyClass;  // Importing MyClass from myPackage

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();  // Creating an object
        obj.displayMessage();  // Calling the method
    }
}
```

### **🔹 Types of Packages**  
1️⃣ **Built-in Packages** → Provided by Java (e.g., `java.util`, `java.io`).  
2️⃣ **User-defined Packages** → Created by developers.  

---

## **2️⃣ Control Statements**  
Control statements in Java **manage the flow of execution** in a program. They are divided into three main types:  

### **🔹 Conditional Statements (if-else, switch)**  
#### **1. If-Else Statement**  
Used to execute different blocks of code based on a condition.  

```java
public class IfElseExample {
    public static void main(String[] args) {
        int number = 10;

        // Check if the number is positive
        if (number > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }
}
```

#### **2. Switch Statement**  
Used to execute one block of code from multiple options.  

```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;  // 1 = Monday, 2 = Tuesday, etc.

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
```

---

### **🔹 Looping Statements (for, while, do-while)**  
Loops are used to execute a block of code multiple times.  

#### **1. For Loop** (When you know the number of iterations)  
```java
public class ForLoopExample {
    public static void main(String[] args) {
        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```

#### **2. While Loop** (When the number of iterations is unknown)  
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        // Print numbers until i is greater than 5
        while (i <= 5) {
            System.out.println("While Loop Iteration: " + i);
            i++;
        }
    }
}
```

#### **3. Do-While Loop** (Executes at least once)  
```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Do-While Iteration: " + i);
            i++;
        } while (i <= 5);
    }
}
```

---

### **🔹 Jump Statements (break, continue, return)**  
Used to control loop execution.  

#### **1. Break Statement** (Exits the loop early)  
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // Stops loop when i = 3
            }
            System.out.println(i);
        }
    }
}
```
**Output:**  
```
1  
2  
```

#### **2. Continue Statement** (Skips an iteration)  
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skips when i = 3
            }
            System.out.println(i);
        }
    }
}
```
**Output:**  
```
1  
2  
4  
5  
```

#### **3. Return Statement** (Exits from a method)  
```java
public class ReturnExample {
    public static void main(String[] args) {
        System.out.println("Before return statement.");
        return;  // Exits the main method
        // System.out.println("After return");  // This will cause an error
    }
}
```
---