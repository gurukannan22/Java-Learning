package programs.newcode;
import java.util.*;
import java.util.stream.*;

public class StreamEX {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Anna", "Andrew", "Brian");

        // Filter names starting with 'A' and print them

        List<String> nameStartsWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(nameStartsWithA);
    }
}

/*
1. collections / arrays -> stream
2. .aggregate functions -> filter, map, reduce
3. assigning the variable.
4. terminal operations -> forEach, collect
 */