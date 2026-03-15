package programs.newcode;

import java.util.Scanner;

public class MyInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name = scan.nextLine();
        System.out.println("Enter your Age :");
        int age = scan.nextInt();
        scan.close();
        System.out.println("name : " + name + " " + "age : " + age);
    }


}
