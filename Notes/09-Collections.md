## **Collections**  

Java Collections Framework (JCF) provides powerful data structures to store, manipulate, and process data efficiently. It includes **Lists, Sets, Maps, and Queues**.

---

## **1️⃣ List (Ordered, Duplicates Allowed)**
A **List** is an **ordered collection** that allows **duplicates**. Common implementations:
- `ArrayList` (Fast for access, slow for insertion/removal)
- `LinkedList` (Fast for insertion/removal, slow for access)

### **✅ ArrayList Example**
```java
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // ✅ Duplicates allowed

        System.out.println(names); // Output: [Alice, Bob, Charlie, Alice]
    }
}
```

### **✅ LinkedList Example**
```java
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        numbers.addFirst(5); // Add at start
        numbers.addLast(40); // Add at end

        System.out.println(numbers); // Output: [5, 10, 20, 30, 40]
    }
}
```

---

## **2️⃣ Set (Unique, No Duplicates)**
A **Set** does **not allow duplicate elements** and has no defined order.
- `HashSet` (Fastest, No Order)
- `LinkedHashSet` (Maintains Insertion Order)
- `TreeSet` (Sorted Order)

### **✅ HashSet Example**
```java
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Apple");
        uniqueNames.add("Banana");
        uniqueNames.add("Apple"); // ❌ Duplicate, ignored

        System.out.println(uniqueNames); // Output: [Banana, Apple] (Order not guaranteed)
    }
}
```

### **✅ TreeSet (Sorted Set) Example**
```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers); // Output: [10, 20, 30] (Sorted Order)
    }
}
```

---

## **3️⃣ Map (Key-Value Pairs)**
A **Map** stores **key-value pairs**.
- `HashMap` (Fastest, No Order)
- `LinkedHashMap` (Maintains Insertion Order)
- `TreeMap` (Sorted by Key)

### **✅ HashMap Example**
```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println(students); // Output: {101=Alice, 102=Bob, 103=Charlie}
        System.out.println(students.get(102)); // Output: Bob
    }
}
```

### **✅ TreeMap (Sorted Map) Example**
```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Math", 90);
        marks.put("English", 85);
        marks.put("Science", 88);

        System.out.println(marks); // Output: {English=85, Math=90, Science=88} (Sorted by Key)
    }
}
```

---

## **4️⃣ Queue (FIFO - First In, First Out)**
A **Queue** follows FIFO order (First-In-First-Out).
- `PriorityQueue` (Elements sorted by priority)
- `LinkedList` (Used as a Queue)

### **✅ Queue Example**
```java
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println(queue.poll()); // Output: Alice (First element removed)
        System.out.println(queue); // Output: [Bob, Charlie]
    }
}
```

### **✅ PriorityQueue Example**
```java
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.poll()); // Output: 10 (Lowest Priority first)
    }
}
```

---

## **Summary**
| Collection Type | Allows Duplicates? | Maintains Order? | Sorted? |
|---------------|----------------|----------------|--------|
| **ArrayList** | ✅ Yes | ✅ Yes | ❌ No |
| **LinkedList** | ✅ Yes | ✅ Yes | ❌ No |
| **HashSet** | ❌ No | ❌ No | ❌ No |
| **TreeSet** | ❌ No | ❌ No | ✅ Yes |
| **HashMap** | ❌ (Keys Unique) | ❌ No | ❌ No |
| **TreeMap** | ❌ (Keys Unique) | ❌ No | ✅ Yes |
| **Queue** | ✅ Yes | ✅ Yes (FIFO) | ❌ No |

---