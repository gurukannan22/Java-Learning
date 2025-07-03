package programs;

public class ThrowExample {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote!");
        }
        System.out.println("You can vote.");
    }

    public static void main(String[] args) {
        validateAge(15);  // Throws exception
    }
}
