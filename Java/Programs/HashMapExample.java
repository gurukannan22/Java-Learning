package Programs;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println(students); // Output: {101=Alice, 102=Bob, 103=Charlie}
        System.out.println(students.get(102)); // Output: Bob
    }
}