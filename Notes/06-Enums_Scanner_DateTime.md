# **Enums, Scanner, DateTime**

## **2️⃣ Enums in Java (Enumeration)**  
An **Enum** is a special class that represents a group of **constants (fixed values)**.  

### **Example: Enum in Java**
```java
enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        WeekDay today = WeekDay.FRIDAY;
        System.out.println("Today is: " + today);

        // Loop through all Enum values
        for (WeekDay day : WeekDay.values()) {
            System.out.println(day);
        }
    }
}
```
**Output:**  
```
Today is: FRIDAY  
MONDAY  
TUESDAY  
WEDNESDAY  
THURSDAY  
FRIDAY  
SATURDAY  
SUNDAY  
```

### **Enum with Constructor**
```java
enum Size {
    SMALL(10), MEDIUM(20), LARGE(30);

    private int value;  // Private field

    // Constructor
    Size(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Size s = Size.LARGE;
        System.out.println("Selected Size: " + s + ", Value: " + s.getValue());
    }
}
```
**Output:**  
```
Selected Size: LARGE, Value: 30
```

---

## **3️⃣ Scanner (User Input in Java)**  
`Scanner` is used to take **user input** from the keyboard.  

### **Example: Taking User Input**
```java
import java.util.Scanner;  // Import Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Read a String

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Read an Integer

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();  // Read a Double

        System.out.println("Hello " + name + ", Age: " + age + ", Salary: " + salary);
        
        sc.close();  // Close Scanner
    }
}
```
**Output (Example Input):**  
```
Enter your name: Guru  
Enter your age: 25  
Enter your salary: 50000  
Hello Guru, Age: 25, Salary: 50000.0  
```

### **Handling Multiple Words (Using `next()` vs `nextLine()`)**
- `next()` → Reads only **one word** (stops at space).  
- `nextLine()` → Reads **full line** (including spaces).  

```java
System.out.print("Enter full name: ");
String fullName = sc.nextLine();  // Reads full name
```

---

## **4️⃣ Date & Time in Java**  
Java provides `java.util.Date`, `java.util.Calendar`, and `java.time` for handling date & time.

### **Getting the Current Date and Time**
```java
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();  // Create Date object
        System.out.println("Current Date and Time: " + date);
    }
}
```
**Output:**  
```
Current Date and Time: Mon Mar 03 12:45:30 IST 2025  
```

---

### **Formatting Dates using `SimpleDateFormat`**
```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Formatted Date: " + sdf.format(date));
    }
}
```
**Output:**  
```
Formatted Date: 03/03/2025 12:45:30  
```

---

### **Working with LocalDate, LocalTime, LocalDateTime (Java 8+)**
```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        LocalDateTime dateTimeNow = LocalDateTime.now();

        System.out.println("Current Date: " + today);
        System.out.println("Current Time: " + timeNow);
        System.out.println("Current Date & Time: " + dateTimeNow);
    }
}
```
**Output:**  
```
Current Date: 2025-03-03  
Current Time: 12:45:30.123  
Current Date & Time: 2025-03-03T12:45:30.123  
```

---