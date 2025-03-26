package Programs;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Apple");
        uniqueNames.add("Banana");
        uniqueNames.add("Apple"); // ❌ Duplicate, ignored

        System.out.println(uniqueNames); // Output: [Banana, Apple] (Order not guaranteed)
    }
}