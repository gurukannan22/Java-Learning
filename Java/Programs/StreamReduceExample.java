package Programs;

import java.util.*;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Sum all elements
        //0+1 = 1, 1+2 =3+3 = 6+1 = 10+5 =15

        System.out.println(sum); // Output: 15
    }
}