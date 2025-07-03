package programs;

import java.util.function.Consumer;

public class LamdaExample {

    public static void main(String[] args) {
        String str = "Monaco";
        Vehicle r2 = () -> System.out.println("Hello Vehicle from Lambda!");
        r2.start();

        Consumer<String> printer = System.out::println;
        printer.accept("Hello, Method References!");

        if(str.toUpperCase()== "MONACO"){
            System.out.println("its uppercase");
        }


    }
}