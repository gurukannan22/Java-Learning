package programs;

public class Inheritance {

    static class Animal{ // super class or parent class
        void makeSound(){
            System.out.println("Animal makes the sound");
        }
    }

    static class Dog extends Animal{
        void makeSound() {
            super.makeSound();
            System.out.println("The Dog barks");
        }
    }

    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.makeSound();
    }
}
