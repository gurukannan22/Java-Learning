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

        Welcome wel = new Welcome() {
            @Override
            public void greet(String name) {
                System.out.println("Welcome to Ednue" + name);
            }
        };

        wel.greet("Vishnu");

        Welcome welcome = (name -> System.out.println("Welcome to Ednue" + name));

        welcome.greet("Chandru");
    }

    interface Welcome{
        void greet(String name);
    }
}