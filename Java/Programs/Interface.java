package Programs;

public class Interface {

   static  class Car implements Vehicle{

        @Override
        public void start() {
            System.out.println("The car Starts");
        }

        @Override
        public void stop() {
            System.out.println("The car Stops");
        }
    }
   static class Lorry implements Vehicle, HeavyVehicle{

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

        @Override
        public void stop() {
            System.out.println("The Lorry Stops");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        Lorry lorry = new Lorry();
        lorry.start();
        lorry.stop();
        lorry.lift();
        lorry.unload();
    }
}
