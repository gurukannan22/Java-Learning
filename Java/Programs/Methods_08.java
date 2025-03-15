package Programs;

public class Methods_08 {
    public static void main(String[] hyt) {
        System.out.println(add(10,30));// calling method and passing the input parameters
        sub(1.00,0.50);
        System.out.println(add(28));
    }

    public static int add(int a, int b){ //Method with the return type int
        int sum = a+b;
        return sum;
    }

    public static int add(int a){ //Method with the return type int
        int sum = a-a;
        return sum;
    }

    public static void sub(double k, double j){
        double subtract = k - j;
        System.out.println(subtract + " This is returned by a Void Method");
    }

    /** METHOD SYNTAX
     * access-modifier | return-type | method-name |(input-parameters){
     * return value;
     * }
     *   void => nothing
     */

}