# **04 Methods**  

## **1️⃣ What are Methods in Java?**  
A **method** in Java is a **block of code that performs a specific task**. It helps in:  
✔ **Code Reusability** → Write once, use multiple times.  
✔ **Modularity** → Divides the program into smaller, manageable parts.  
✔ **Readability** → Makes the code cleaner and easier to understand.  

---

## **2️⃣ Types of Methods in Java**  
Java has **two types** of methods:  
1️⃣ **Predefined Methods** → Built-in methods (e.g., `Math.sqrt()`, `System.out.println()`).  
2️⃣ **User-Defined Methods** → Methods created by the programmer.  

---

## **3️⃣ Creating a User-Defined Method**  
### **Syntax:**  
```java
returnType methodName(parameters) {
    // Method body
    return value; // Optional, required if returnType is not void
}
```
### **Example: A Simple Method**
```java
public class MethodExample {
    // Method that prints a message
    static void sayHello() {
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        sayHello();  // Calling the method
    }
}
```
**Output:**  
```
Hello, Java!
```

---

## **4️⃣ Method Parameters and Return Type**  

### **1. Method with Parameters**  
A method can accept **parameters (inputs)** to work with.  
```java
public class SumCalculator {
    // Method with parameters
    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        addNumbers(5, 10);  // Passing arguments 5 and 10
    }
}
```
**Output:**  
```
Sum: 15
```

### **2. Method with Return Value**  
A method can return a **value** using the `return` keyword.  
```java
public class SquareCalculator {
    // Method that returns a value
    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = square(4);  // Calling the method
        System.out.println("Square: " + result);
    }
}
```
**Output:**  
```
Square: 16
```

### **3. Method Overloading** (Same method name, different parameters)  
```java
public class MethodOverloading {
    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum (2 numbers): " + add(5, 10));
        System.out.println("Sum (3 numbers): " + add(5, 10, 15));
    }
}
```
**Output:**  
```
Sum (2 numbers): 15  
Sum (3 numbers): 30  
```

---

## **5️⃣ Static vs Non-Static Methods**  

### **1. Static Methods**  
- Belong to the **class**, not an object.  
- Called using the class name.  
```java
public class StaticExample {
    // Static method
    static void showMessage() {
        System.out.println("This is a static method!");
    }

    public static void main(String[] args) {
        StaticExample.showMessage();  // Calling without creating an object
    }
}
```

### **2. Non-Static Methods**  
- Belong to an **object** of the class.  
- Need an **object** to be called.  
```java
public class NonStaticExample {
    // Non-static method
    void showMessage() {
        System.out.println("This is a non-static method!");
    }

    public static void main(String[] args) {
        NonStaticExample obj = new NonStaticExample();  // Creating an object
        obj.showMessage();  // Calling method using the object
    }
}
```

---

## **6️⃣ Recursion in Java (Method Calling Itself)**  
A **recursive method** calls itself to solve a problem.  

### **Example: Factorial Using Recursion**  
```java
public class RecursionExample {
    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 1) return 1;  // Base case
        return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
```
**Output:**  
```
Factorial of 5: 120  
```

---