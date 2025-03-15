# **Java IO and File Handling Streams**  

Java provides a powerful **I/O (Input/Output) API** to handle **files, streams, and data processing** efficiently. This section covers **reading/writing files, handling streams, and using serialization**.  

---

## **1️⃣ Java I/O Overview**  
Java follows a **stream-based approach** for I/O operations.  

✅ **Types of Streams:**  
- **Byte Streams** (`InputStream`, `OutputStream`) → For binary data (images, audio, etc.)  
- **Character Streams** (`Reader`, `Writer`) → For text data (UTF-8, Unicode, etc.)  

✅ **Common I/O Classes:**  
| **Class** | **Purpose** |
|-----------|------------|
| `File` | Represents file/directory path |
| `FileInputStream` | Reads data as bytes |
| `FileOutputStream` | Writes data as bytes |
| `FileReader` | Reads text files |
| `FileWriter` | Writes text files |
| `BufferedReader` | Reads text efficiently |
| `BufferedWriter` | Writes text efficiently |
| `ObjectInputStream` | Reads serialized objects |
| `ObjectOutputStream` | Writes serialized objects |

---

## **2️⃣ Working with Files (`File` Class)**  
The `java.io.File` class represents **files and directories** in Java.

### **🔹 Creating a File**
```java
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### **🔹 Checking File Properties**
```java
System.out.println("File Name: " + file.getName());
System.out.println("Absolute Path: " + file.getAbsolutePath());
System.out.println("Writable: " + file.canWrite());
System.out.println("Readable: " + file.canRead());
System.out.println("File Size (bytes): " + file.length());
```

### **🔹 Deleting a File**
```java
if (file.delete()) {
    System.out.println("File deleted: " + file.getName());
} else {
    System.out.println("Failed to delete file.");
}
```

---

## **3️⃣ Reading and Writing Files**  
## **📌 Byte Stream (Binary Data)**
### **🔹 Writing to a File (`FileOutputStream`)**
```java
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("binary.dat")) {
            fos.write(65); // Writes 'A' (ASCII 65)
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### **🔹 Reading a File (`FileInputStream`)**
```java
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("binary.dat")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);  // Convert byte to char
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## **📌 Character Stream (Text Data)**
### **🔹 Writing to a File (`FileWriter`)**
```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("textfile.txt")) {
            writer.write("Hello, Java File Handling!");
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### **🔹 Reading a File (`FileReader`)**
```java
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("textfile.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## **4️⃣ Buffered Streams (Efficient I/O)**
### **🔹 Reading with `BufferedReader`**
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("textfile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### **🔹 Writing with `BufferedWriter`**
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("textfile.txt", true))) {
            bw.write("\nAppended Line");
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## **5️⃣ Object Serialization (Storing Objects)**
Serialization allows **converting objects into byte streams** to save them into files or transfer over networks.

### **🔹 Writing an Object to File (`ObjectOutputStream`)**
```java
import java.io.*;

class Person implements Serializable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializeExample {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            Person p1 = new Person("John", 25);
            oos.writeObject(p1);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### **🔹 Reading an Object from File (`ObjectInputStream`)**
```java
import java.io.*;

public class DeserializeExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person p = (Person) ois.readObject();
            System.out.println("Name: " + p.name + ", Age: " + p.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

---

## **6️⃣ Java NIO (New I/O)**
Java **NIO (Non-blocking I/O)** provides faster file handling using **buffers and channels**.  

✅ **Why use NIO?**  
- Uses **Buffers & Channels** instead of Streams  
- Supports **Asynchronous & Memory-Mapped I/O**  
- Faster than standard `java.io`  

Example: **Reading a File using `Files` API**
```java
import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class NIOExample {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("textfile.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## **7️⃣ Summary**
| **Concept** | **Description** |
|------------|---------------|
| **File Class** | Represents files & directories |
| **Byte Streams** | Read/write binary files |
| **Character Streams** | Read/write text files |
| **Buffered Streams** | Efficient reading & writing |
| **Serialization** | Convert objects to byte streams |
| **Java NIO** | High-performance file handling |

---