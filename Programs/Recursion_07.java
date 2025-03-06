public class Recursion_07 {

    // Recursive method to calculate factorial
    static int factorial(int n){
        if (n == 1) return 1; // Base case
        return n * factorial(n-1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is : " + factorial(5));
    }
    
}
