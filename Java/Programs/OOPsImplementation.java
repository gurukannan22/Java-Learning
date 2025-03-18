package Programs;

public class OOPsImplementation {
    static Car carObj = new Car(); // Object Creation
    public static void main(String[] args) {
        carObj.setClr("Red");
        carObj.setCompanyName("Datsun");
        displayCar();
    }

    static void displayCar() {
        System.out.println("Car Name : " + carObj.getCompanyName() + " color " + carObj.getClr());
    }
}
