package programs;

public class Interface {
   static class Lorry implements HeavyVehicle,Vehicle{

        @Override
        public void lift() {
            System.out.println("The Lorry Lift the weights");
        }

        @Override
        public void unload() {
            System.out.println("The lorry unloads the weights");
        }

        @Override
        public void start() {
            System.out.println("The Lorry Starts");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Lorry lorry = new Lorry();
        lorry.start();
        lorry.lift();
        lorry.unload();
    }
}
