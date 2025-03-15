## **Streams**  

Java **Streams** provide a powerful way to process collections of data in a functional style. They simplify complex operations like filtering, mapping, and reducing large datasets efficiently.

---

## **1️⃣ What is a Stream?**
A **Stream** in Java is a **sequence of elements** that supports **aggregate operations** (e.g., filter, map, reduce) without modifying the original data.

✅ **Key Features of Streams:**  
- **Functional-style processing** (No need for loops)  
- **Laziness & efficiency** (Processes elements only when needed)  
- **Parallel execution support** (Faster operations on large datasets)  
- **Immutable** (Does not modify the original collection)  

---

## **2️⃣ Creating a Stream**
We can create Streams from different sources like Lists, Sets, Arrays, and Files.

### **✅ Stream from a List**
```java
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.stream() // Convert List to Stream
             .filter(name -> name.startsWith("A")) // Keep names starting with "A"
             .forEach(System.out::println); // Output: Alice
    }
}
```

### **✅ Stream from an Array**
```java
import java.util.Arrays;

public class ArrayStreamExample {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        Arrays.stream(numbers)
              .map(n -> n * 2) // Multiply each element by 2
              .forEach(System.out::println); // Output: 10, 20, 30, 40
    }
}
```

---

## **3️⃣ Stream Operations**
Streams allow us to perform operations using **intermediate** and **terminal** methods.

✅ **Types of Stream Operations:**  
1. **Intermediate Operations** (Returns another stream, lazy evaluation)  
   - `filter(Predicate condition)` → Selects elements  
   - `map(Function<T, R>)` → Transforms elements  
   - `sorted()` → Sorts elements  
   - `distinct()` → Removes duplicates  
2. **Terminal Operations** (Consumes the stream)  
   - `forEach(Consumer<T>)` → Iterates elements  
   - `collect(Collectors.toList())` → Collects results  
   - `count()` → Returns the number of elements  
   - `reduce(BinaryOperator<T>)` → Aggregates elements  

---

## **4️⃣ Filtering Elements (filter)**
Filters elements that satisfy a condition.

```java
import java.util.*;
import java.util.stream.*;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 40, 55);

        numbers.stream()
               .filter(n -> n > 25) // Keep numbers greater than 25
               .forEach(System.out::println); // Output: 30, 40, 55
    }
}
```

---

## **5️⃣ Transforming Elements (map)**
Transforms each element using a function.

```java
import java.util.*;
import java.util.stream.*;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "jane", "doe");

        names.stream()
             .map(String::toUpperCase) // Convert to uppercase
             .forEach(System.out::println); // Output: JOHN, JANE, DOE
    }
}
```

---

## **6️⃣ Sorting Elements (sorted)**
Sorts the elements in **natural order** or using a **custom comparator**.

```java
import java.util.*;
import java.util.stream.*;

public class StreamSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 20, 40, 10, 30);

        numbers.stream()
               .sorted()
               .forEach(System.out::println); // Output: 10, 20, 30, 40, 50
    }
}
```

---

## **7️⃣ Collecting Results (collect)**
Stores the processed elements into a new List, Set, or Map.

```java
import java.util.*;
import java.util.stream.*;

public class StreamCollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "cherry");

        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println(upperCaseNames); // Output: [APPLE, BANANA, CHERRY]
    }
}
```

---

## **8️⃣ Reducing Elements (reduce)**
Combines elements into a single result.

```java
import java.util.*;
import java.util.stream.*;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .reduce(0, Integer::sum); // Sum all elements

        System.out.println(sum); // Output: 15
    }
}
```

---

## **9️⃣ Parallel Streams**
Use **parallel streams** for **multi-threaded processing**, improving performance on large datasets.

```java
import java.util.*;
import java.util.stream.*;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.parallelStream()
               .forEach(System.out::println); // May print in random order
    }
}
```

---

## **Summary**
| **Operation**  | **Description** |
|---------------|----------------|
| `filter(Predicate)` | Filters elements |
| `map(Function<T,R>)` | Transforms elements |
| `sorted()` | Sorts elements |
| `collect(Collectors.toList())` | Collects elements into a List |
| `reduce(BinaryOperator<T>)` | Combines elements |
| `forEach(Consumer<T>)` | Iterates over elements |
| `distinct()` | Removes duplicates |
| `count()` | Counts elements |

---