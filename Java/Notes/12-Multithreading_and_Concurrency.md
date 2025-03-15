# **Multithreading and Concurrency**  

Java provides built-in support for **multithreading and concurrency** to execute multiple tasks **simultaneously**, improving performance for CPU-intensive and I/O-bound applications.  

---

## **1️⃣ What is Multithreading?**  
Multithreading allows multiple **threads** (lightweight subprocesses) to run **concurrently** within the same application.  

✅ **Benefits of Multithreading:**  
- **Better CPU Utilization** (Utilizes multi-core processors)  
- **Faster Execution** (Multiple tasks run in parallel)  
- **Improved Responsiveness** (UI applications stay responsive)  

---

## **2️⃣ Creating Threads in Java**  
Java provides two ways to create a thread:  

### **🔹 Method 1: Extending `Thread` Class**  
```java
class MyThread extends Thread {
    public void run() {  // Override run() method
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Start the thread
    }
}
```

### **🔹 Method 2: Implementing `Runnable` Interface**  
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
```
✅ **Which one to use?**  
- **Extend `Thread`** → When no other class needs to be extended.  
- **Implement `Runnable`** → Recommended, as it allows extending other classes.  

---

## **3️⃣ Thread Lifecycle**  
A thread in Java goes through different **states**:  

| **State** | **Description** |
|-----------|----------------|
| **NEW** | Thread is created but not started. |
| **RUNNABLE** | Thread is ready to run. |
| **RUNNING** | Thread is currently executing. |
| **BLOCKED** | Waiting for a resource. |
| **WAITING/TIMED_WAITING** | Paused temporarily. |
| **TERMINATED** | Execution is completed. |

---

## **4️⃣ Thread Methods**
| **Method** | **Description** |
|-----------|---------------|
| `start()` | Starts a new thread |
| `run()` | Defines thread execution logic |
| `sleep(ms)` | Pauses execution for `ms` milliseconds |
| `join()` | Waits for another thread to complete |
| `isAlive()` | Checks if the thread is running |

### **🔹 Example: `sleep()` and `join()`**
```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start();
        t1.join();  // Waits for t1 to finish before starting t2
        t2.start();
    }
}
```

---

## **5️⃣ Synchronization in Java**  
Multiple threads **accessing shared data** can lead to **race conditions**. **Synchronization** ensures that only **one thread** accesses critical code at a time.

### **🔹 Synchronized Method**
```java
class Counter {
    private int count = 0;

    public synchronized void increment() {  // Synchronizing the method
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) counter.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) counter.increment(); });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());  // Expected output: 2000
    }
}
```

### **🔹 Synchronized Block**
Instead of synchronizing the entire method, we can synchronize **only a part of the code** for better performance.
```java
public void increment() {
    synchronized (this) { // Synchronizing only this block
        count++;
    }
}
```

---

## **6️⃣ Deadlock & How to Avoid It**  
A **deadlock** occurs when two or more threads **wait indefinitely** for each other’s resources.  

### **🔹 Example of Deadlock**
```java
class Resource {
    void methodA() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is in methodA");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (String.class) {  // Waiting for another lock
                System.out.println(Thread.currentThread().getName() + " locked String.class");
            }
        }
    }

    void methodB() {
        synchronized (String.class) {  // Locks String.class first
            System.out.println(Thread.currentThread().getName() + " is in methodB");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (this) {  // Waiting for another lock
                System.out.println(Thread.currentThread().getName() + " locked Resource.class");
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource res = new Resource();
        Thread t1 = new Thread(() -> res.methodA());
        Thread t2 = new Thread(() -> res.methodB());

        t1.start();
        t2.start();
    }
}
```
✅ **How to Avoid Deadlocks?**  
- **Always acquire locks in the same order**  
- **Use timeout mechanisms**  
- **Minimize synchronized sections**  

---

## **7️⃣ Executor Framework (Thread Pool)**
The **Executor Framework** in Java **manages threads efficiently** by using a thread pool.  

✅ **Why use Thread Pools?**  
- Prevents creating too many threads  
- Reuses existing threads  
- Improves performance  

### **🔹 Example using `ExecutorService`**
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
```

---

## **8️⃣ Java `Callable` and `Future`**
Unlike `Runnable`, **`Callable`** allows **returning a result** from a thread.

### **🔹 Example of `Callable` and `Future`**
```java
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(2000); // Simulating work
            return 42;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Doing other work...");

        System.out.println("Result from thread: " + future.get()); // Blocking call
        executor.shutdown();
    }
}
```

---

## **9️⃣ Summary**
| **Concept** | **Description** |
|------------|---------------|
| **Multithreading** | Running multiple threads in parallel |
| **Thread States** | NEW, RUNNABLE, BLOCKED, WAITING, TERMINATED |
| **Synchronization** | Prevents race conditions using `synchronized` |
| **Deadlocks** | Occurs when two threads wait indefinitely |
| **Executor Framework** | Manages threads using a pool |
| **Callable & Future** | Allows returning a result from a thread |

---