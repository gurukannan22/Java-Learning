package programs;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("list.zip");
            file.write("Name: Sanjay Ramaswamy\n");
            file.write("Age: 28\n");
            file.write("Course: Java Programming\n");
            file.close();
            System.out.println("Data Stored Successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
