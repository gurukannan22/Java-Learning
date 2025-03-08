package Programs;

public class LoopingStatements_05 {
    public static void main(String[] args) {
//        ForLoopExample.forLoop();
//        WhileLoopExample.whileLoop();
        DoWhileLoopExample.doWhileLoop();
    }

    class ForLoopExample{ // use When you know the number of iterations
        static void forLoop(){
            for(int i=0; i<=20; i++) { // syntax => ([int i=0] -> initiation, [i<=20] -> condition, [i++] -> increment )
                System.out.println("Hi Hello Welcome to Ednue Tech !!"); // prints 20 times
                System.out.println(i); // prints the value of i
            }
        }
    }

    class WhileLoopExample{ // use When you don't know the number of iterations
        static void whileLoop(){
            int i = 1;
            while(i<5) { // The condition is evaluated before the execution of the loop's body. 
                        // If the condition is false initially, the loop body will not execute even once.
                System.out.println("Welcoming you for " + i + " times"); // print for 4 times
                i++;
            }
        }

    }

    class DoWhileLoopExample{ // Executes at least one time
        static void doWhileLoop(){
            int i = 0;
            do{
                System.out.println("Executing the Do While Loop for " + i + " times");// executes the condition
            } while(i<0); // The condition is evaluated after the execution of the loop's body.
                        // This ensures that the loop body is executed at least once, regardless of whether the condition is initially true or false.
        }
    }
    
}
