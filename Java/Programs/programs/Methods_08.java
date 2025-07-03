package programs;

public class Methods_08 {
    public static void main(String[] hyt) {
        System.out.println(addNumbers(10,20));
        System.out.println(welcome("Selva"));
    }

    public static int addNumbers(int a, int b){
        int sum = a+b;
        System.out.println(welcome("mohan"));
        return sum;
    }

    public static int addNumbers(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(welcome("mohan"));
        return sum;
    }

    static String welcome(String name){
        return "Ednue Welcomes you "+name;
    }

    /** METHOD SYNTAX
     * access-modifier | return-datatype | method-name |(input-parameters){
     * return value;
     * }
     *   void => nothing
     */

}