package Programs;

/**
 * TypeCasting => converting one datatype into other is called Typecasting
 * autocasting, manualcasting
 *
 */

public class TypeCasting_02 {
    public static void main(String[] args) {
        int a = 21;
        System.out.println(a);
        double myDouble = a; // Auto casting
        System.out.println(myDouble);
        long myLong = (long) myDouble; // Manual casting
        System.out.println(myLong);
    }
    
}