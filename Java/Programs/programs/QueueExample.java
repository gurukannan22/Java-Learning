package programs;

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