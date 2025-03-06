public class ControlStatements_04 {
    public static void main(String[] args) {
       IfElseExample.ifElse();
       SwitchExample.switchStatement();

    }

    class IfElseExample{
        static void ifElse() {
            int a = 10, b = 20, sum;
            sum = a+b;
            if(sum < 40){
                System.out.println("The Sum is Lesser than 40");
            }else{
                System.out.println("The Sum is Greater than 40");
            }
        }
    }

    class SwitchExample{
        static void switchStatement(){
            int day = 5;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Invalid Option Entry");
                    break;
            }
        }
    }
    
}
