package programs;

public class ControlStatements_04 {
    public static void main(String[] args) {
//       IfElseExample.ifElse(); // Method calling
       SwitchExample.switchStatement();

    }

    class IfElseExample{
        static void ifElse() { // Method returns nothing (void => returns nothing) 
            int a = 10, b = 20, sum;
            sum = a+b;
            if(sum < 10){ // checks the the given statement is true
                System.out.println("The Sum is Lesser than 40");
            } else if (sum > 70) {
                System.out.println("The Sum is Greater than 20");
            }else{
                System.out.println("Else part is executed");
            }
        }
    }

    class ShortHandIfElseExample{ //  (Ternary Operator)
        static void shortHandIfElse(){
            int a = 10, b = 20, sum = a+b;
            String result = (sum < 40) ? "The Sum is Lesser than 40" : "The Sum is Greater than 40"; 
            // variable = (condition) ? expressionTrue :  expressionFalse;
            System.out.println(result);
        }
    }

    class SwitchExample{
        static void switchStatement(){
            int day = 3;
            System.out.println("Please Select the option below\n 1.Monday\n 2.Tuesday\n 3.Wednesday");
            switch (day) { // Switch based the key
                case 1:
                    System.out.println("Working Day");
                    break;
                case 2:
                    System.out.println("Working Day");
                    break; 
                case 3:
                    System.out.println("Working Day");
                    break;
                case 4:
                   System.out.println("Working Day");
                   break;
                case 5:
                   System.out.println("Working Day");
                   break;
                case 6:
                   System.out.println("Leave");
                   break;
                    default:
                    System.out.println("Invalid Option Entry");
                    break;
            }
        }
    }
    
}
