package programs;

import java.util.Arrays;

public class Arrays_03 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7}; // Integer Array
        String[] strArray = {"One","Two","Three","Four","Five","Six","Seven"}; // String Array
        System.out.println(array[5]); // Accessing using index (index stars from 0)
        System.out.println(strArray[5]); // Accessing using index

        // Print strings that start with 't' (case-insensitive) - WITHOUT streams
        System.out.println("\nStrings starting with 't' (without streams):");
        for (String str : strArray) {
            if (str.toLowerCase().startsWith("t")) {
                System.out.println(str);
            }
        }
        
        // Print strings that start with 't' (case-insensitive) - WITH streams
        System.out.println("\nStrings starting with 't' (with streams):");
        Arrays.stream(strArray)
              .filter(str -> str.toLowerCase().startsWith("t"))
              .forEach(System.out::println);
    }
    
}
