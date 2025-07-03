# **OOPs Concepts** 

## **1️⃣ What is Object-Oriented Programming (OOP)?**  
**Object-Oriented Programming (OOP)** is a programming paradigm based on the concept of **objects**, which bundle data and behavior together.  
OOP provides:  
✔ **Code Reusability** → Write once, use multiple times.  
✔ **Modularity** → Divides the program into smaller, manageable parts.  
✔ **Encapsulation** → Protects data from unauthorized access.  
✔ **programs.Abstraction** → Hides complex implementation details.  
✔ **Inheritance** → Enables code reuse from parent classes.  
✔ **Polymorphism** → Allows methods to have multiple forms.  

---

## **2️⃣ Classes and Objects in Java**  
### **1. What is a Class?**  
A **class** is a blueprint/template for creating objects. It defines:  
- **Attributes (Variables/Fields)** → Store data  
- **Methods (Functions)** → Define behavior  

### **2. What is an Object?**  
An **object** is an **instance** of a class, meaning it has its own values and behaviors.  

### **Example: Creating a Class and Object**
```java
// Defining a class
class programs.Car {
    // Attributes (fields)
    String brand;
    int speed;

    // Method (behavior)
    void displayCar() {
        System.out.println("programs.Car Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object
        programs.Car myCar = new programs.Car();
        myCar.brand = "Toyota";
        myCar.speed = 120;
        myCar.displayCar();  // Calling the method
    }
}
```
**Output:**  
```
programs.Car Brand: Toyota, Speed: 120 km/h
```

---

## ***2.1 Constructors in Java***
A **constructor** is a special method used to **initialize objects** when they are created. It has:  
✔ The **same name** as the class.  
✔ **No return type** (not even `void`).  
✔ **Automatic invocation** when an object is created.  

### **Types of Constructors in Java**  
1️⃣ **Default Constructor** → No parameters, initializes with default values.  
2️⃣ **Parameterized Constructor** → Takes arguments to set values during object creation.  
3️⃣ **Copy Constructor** → Copies values from another object.  

### **Example: Default & Parameterized Constructors**
```java
class programs.Car {
    String brand;
    int speed;

    // Default Constructor
    programs.Car() {
        brand = "Unknown";
        speed = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    programs.Car(String b, int s) {
        brand = b;
        speed = s;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("programs.Car Brand: " + brand + ", Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        programs.Car car1 = new programs.Car();  // Calls Default Constructor
        car1.display();

        programs.Car car2 = new programs.Car("Toyota", 120);  // Calls Parameterized Constructor
        car2.display();
    }
}
```
**Output:**  
```
Default Constructor Called  
programs.Car Brand: Unknown, Speed: 0  
Parameterized Constructor Called  
programs.Car Brand: Toyota, Speed: 120  
```
---

## **3️⃣ Encapsulation (Data Hiding)**  
Encapsulation **protects data** by making fields private and providing public getter/setter methods.  

### **Example: Encapsulation in Java**
```java
class BankAccount {
    private double balance;  // Private field

    // Setter method to update balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Getter method to access balance
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(5000);  // Setting balance
        System.out.println("Balance: " + account.getBalance());  // Getting balance
    }
}
```
**Output:**  
```
Balance: 5000.0
```

---

## **4️⃣ Inheritance (Code Reusability)**  
Inheritance allows a **child class** to acquire the properties and behavior of a **parent class**.  
✅ **Parent Class** → Base class (superclass)  
✅ **Child Class** → Derived class (subclass)  

### **Example: Inheritance in Java**
```java
// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();  // Inherited method
        myDog.bark();  // Child class method
    }
}
```
**Output:**  
```
Animal makes a sound.  
Dog barks.
```

---

## **5️⃣ Polymorphism (Method Overriding & Overloading)**  
Polymorphism allows a method to have **multiple forms**:  
✔ **Method Overloading** → Same method name, different parameters.  
✔ **Method Overriding** → Redefining a method in the child class.  

### **1. Method Overloading (Compile-Time Polymorphism)**
```java
class MathOperations {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum (2 numbers): " + math.add(5, 10));
        System.out.println("Sum (3 numbers): " + math.add(5, 10, 15));
    }
}
```
**Output:**  
```
Sum (2 numbers): 15  
Sum (3 numbers): 30  
```

### **2. Method Overriding (Runtime Polymorphism)**
```java
class Parent {
    void showMessage() {
        System.out.println("Message from Parent");
    }
}

class Child extends Parent {
    @Override
    void showMessage() {
        System.out.println("Message from Child (Overridden)");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();  // Dynamic method dispatch
        obj.showMessage();  // Calls overridden method
    }
}
```
**Output:**  
```
Message from Child (Overridden)
```

---

## **6️⃣ programs.Abstraction (Hiding Implementation Details)**  
programs.Abstraction hides implementation details and shows **only essential features**.  
- **Abstract Class** → A class that **cannot** be instantiated.  
- **Abstract Methods** → Methods with no implementation (to be overridden by subclasses).  

### **Example: Abstract Class and Method**
```java
// Abstract class
abstract class Vehicle {
    abstract void start();  // Abstract method
}

// Concrete class (subclass)
class programs.Car extends Vehicle {
    @Override
    void start() {
        System.out.println("programs.Car starts with a key.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new programs.Car();
        myCar.start();  // Calls overridden method
    }
}
```
**Output:**  
```
programs.Car starts with a key.
```

---

## **7️⃣ Interfaces (Achieving 100% programs.Abstraction)**  
An **interface** is a contract that defines methods **without implementation**. A class **must implement** all its methods.  

### **Example: Interface in Java**
```java
// Defining an interface
interface Animal {
    void makeSound();  // Abstract method
}

// Implementing the interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
    }
}
```
**Output:**  
```
Cat meows.
```
---