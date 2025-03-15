## **Access Modifiers, Final and Static**  

### **1️⃣ Access Modifiers in Java**  
Access modifiers **control the visibility** of classes, methods, and variables.  

| Modifier  | Within Class | Within Package | Outside Package (Subclass) | Outside Package (No Subclass) |
|-----------|-------------|---------------|----------------------|----------------------|
| **public**    | ✅ | ✅ | ✅ | ✅ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **default**   | ✅ | ✅ | ❌ | ❌ |
| **private**   | ✅ | ❌ | ❌ | ❌ |

```java
class Example {
    public int publicVar = 10;     // Accessible everywhere
    private int privateVar = 20;   // Only inside this class
    protected int protectedVar = 30; // Accessible within package & subclasses
    int defaultVar = 40;           // Accessible only within package
}
```

---

### **2️⃣ `final` Keyword in Java**  
The `final` keyword **prevents modification** of variables, methods, or classes.  

#### **(a) `final` Variable – Constant Value**  
```java
class Test {
    final int MAX_VALUE = 100; // Cannot change value after initialization

    void display() {
        // MAX_VALUE = 200;  // ❌ ERROR! Cannot modify a final variable
        System.out.println(MAX_VALUE);
    }
}
```

#### **(b) `final` Method – Prevent Overriding**  
```java
class Parent {
    final void show() {
        System.out.println("This is a final method");
    }
}

class Child extends Parent {
    // void show() {} ❌ ERROR! Cannot override a final method
}
```

#### **(c) `final` Class – Prevent Inheritance**  
```java
final class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// class Dog extends Animal {} ❌ ERROR! Cannot inherit from a final class
```

---

### **3️⃣ Static Members in Java**  
Static members belong to the **class itself** rather than an instance.

#### **(a) Static Variable – Shared Across Objects**  
```java
class Counter {
    static int count = 0;  // Shared by all objects

    Counter() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.count); // Output: 2
    }
}
```

#### **(b) Static Method – Can be Called Without an Object**  
```java
class MathUtils {
    static int square(int num) {
        return num * num;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(5)); // Output: 25
    }
}
```

#### **(c) Static Block – Executes Before `main()`**  
```java
class Example {
    static {
        System.out.println("Static block executed before main!");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
```
**Output:**  
```
Static block executed before main!  
Main method executed  
```

---

### **4️⃣ Instance Initialization Block (`IIB`)**  
Instance blocks execute **before the constructor** when an object is created.

```java
class Demo {
    {
        System.out.println("Instance Block Executed");
    }

    Demo() {
        System.out.println("Constructor Executed");
    }
}

public class Main {
    public static void main(String[] args) {
        new Demo();
    }
}
```
**Output:**  
```
Instance Block Executed  
Constructor Executed  
```

---