# **Functional Programming and Lambda**  

Java introduced **Functional Programming** with **Lambda Expressions** and the **java.util.function** package in Java 8. These features allow writing cleaner, more readable, and efficient code.  

---

## **1️⃣ What is Functional Programming?**  
Functional programming treats **functions as first-class citizens**, allowing them to be **passed as arguments**, **returned from methods**, and **stored in variables**.  

✅ **Key Principles:**  
- **Immutability** (Avoid modifying state)  
- **Pure Functions** (Same input → Same output)  
- **Higher-Order Functions** (Functions taking functions as arguments)  

---

## **2️⃣ Lambda Expressions in Java**  
A **Lambda Expression** is an anonymous function (a function without a name).  

✅ **Syntax:**  
```java
(parameters) -> { function body }
```

✅ **Example:**  
```java
// Traditional way using an anonymous class
Runnable r1 = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello from Runnable!");
    }
};

// Using Lambda Expression
Runnable r2 = () -> System.out.println("Hello from Lambda!");
```

---

## **3️⃣ Functional Interfaces**
A **Functional Interface** is an interface with only **one abstract method**.  
Java provides built-in functional interfaces in the **java.util.function** package.

✅ **Example:**  
```java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

// Implementing using Lambda
public class LambdaExample {
    public static void main(String[] args) {
        Greeting greet = (name) -> System.out.println("Hello, " + name);
        greet.sayHello("Guru"); // Output: Hello, Guru
    }
}
```

✅ **Common Functional Interfaces:**  
| **Interface** | **Method** | **Description** |
|-------------|-----------|----------------|
| `Predicate<T>` | `boolean test(T t)` | Returns `true` or `false` based on a condition |
| `Function<T,R>` | `R apply(T t)` | Converts one value type to another |
| `Consumer<T>` | `void accept(T t)` | Performs an action without returning a result |
| `Supplier<T>` | `T get()` | Provides a value without taking input |

---

## **4️⃣ Using Built-in Functional Interfaces**
### **🔹 Predicate Example**
```java
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.println(isEven.test(10)); // Output: true
        System.out.println(isEven.test(7));  // Output: false
    }
}
```

### **🔹 Function Example**
```java
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = (str) -> str.length();
        System.out.println(lengthFunction.apply("Lambda")); // Output: 6
    }
}
```

### **🔹 Consumer Example**
```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = (str) -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello"); // Output: HELLO
    }
}
```

### **🔹 Supplier Example**
```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()); // Output: Some random number
    }
}
```

---

## **5️⃣ Method References**
Method references allow referring to methods **without executing them**.  
✅ **Syntax:**  
```java
ClassName::methodName
```

✅ **Example:**  
```java
import java.util.function.Consumer;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Consumer<String> printer = System.out::println;
        printer.accept("Hello, Method References!"); // Output: Hello, Method References!
    }
}
```

✅ **Types of Method References:**  
| **Type** | **Example** |
|----------|------------|
| **Static Method Reference** | `ClassName::staticMethod` |
| **Instance Method Reference** | `object::instanceMethod` |
| **Constructor Reference** | `ClassName::new` |

---

# **6️⃣ Chaining Functional Interfaces**
Functional interfaces can be **chained together** for more powerful operations.  

✅ **Example:**  
```java
import java.util.function.Function;

public class FunctionChainingExample {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 = (num) -> num * 2;
        Function<Integer, Integer> add10 = (num) -> num + 10;

        // Chaining functions
        Function<Integer, Integer> multiplyThenAdd = multiplyBy2.andThen(add10);
        System.out.println(multiplyThenAdd.apply(5)); // Output: 20
    }
}
```

---

## **7️⃣ Stream API with Lambda Expressions**
Lambdas are **heavily used** in **Streams** for data processing.

✅ **Example: Filtering a List**
```java
import java.util.*;
import java.util.stream.*;

public class StreamLambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println); // Output: Alice
    }
}
```

---

## **8️⃣ Summary**
| **Concept** | **Description** |
|------------|---------------|
| **Lambda Expressions** | Anonymous functions that make code concise |
| **Functional Interfaces** | Interfaces with a single abstract method |
| **Built-in Functional Interfaces** | `Predicate`, `Function`, `Consumer`, `Supplier` |
| **Method References** | Shortcuts for referring to existing methods |
| **Stream API** | Uses Lambdas for efficient data processing |

---