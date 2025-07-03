package programs;

public class ExceptionExample {

    public static void main(String[] args) {
        try{
            division(10,0);
        } catch (ArithmeticException e) {
            System.out.println("The Input is wrong because : " + e.getMessage());
        }
    }

    public static void division(int a, int b) throws ArithmeticException{
        int result;
        result = a/b;
        System.out.println("The result is : "+ result);
    }
}