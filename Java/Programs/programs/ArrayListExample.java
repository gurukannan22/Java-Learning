package programs;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>(19);
        arrlist.add("One");
        arrlist.add("Two");
        arrlist.add("Three");
        arrlist.add("Four");
        arrlist.add("Five");
        arrlist.add("Six");
        arrlist.add("Seven"); // adds the elements to the arraylist
        System.out.println( arrlist.get(0)); // retrieves
        arrlist.set(6,"SEVEN"); //Replaces element at index
        System.out.println(arrlist);
        System.out.println(arrlist.size()); //retrieves the size of the Array
        System.out.println(arrlist.indexOf("Five")); //Returns index of first occurrence
        arrlist.remove("SEVEN"); //Removes first occurrence of object
        arrlist.remove(5); //Removes element at index
        System.out.println(arrlist);
    }
}
