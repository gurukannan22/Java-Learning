package Programs;

public class Inheritance {

    static class Animal{ // super class or parent class
        void makeSound(){
            System.out.println("Animal makes the sound");
        }
    }

    static class Dog extends Animal{ // sub-class or child-class

        @Override
        void makeSound() {
            System.out.println("The Dog barks");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}
