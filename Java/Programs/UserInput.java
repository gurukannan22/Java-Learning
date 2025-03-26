package Programs;

import java.util.Scanner;

public class UserInput {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter your Name: ");
        String name = scan.next();
        System.out.println("Enter you age: ");
        int age = scan.nextInt();
//        double temperature = scan.nextDouble();
//        long mobileNumber = scan.nextLong();
        System.out.println("Your name is : " + name + "\n" + "Your age is : " + age);
        System.out.println("Enter the numbers to add: ");
        int fst = scan.nextInt();
        int snd = scan.nextInt();
        scan.close();
        add(fst,snd);
    }

    static void add(int a, int b){
        int sum = a+b;
        System.out.println("The sum of the "+ a +" and " + b +" is = "+sum);
    }
}
