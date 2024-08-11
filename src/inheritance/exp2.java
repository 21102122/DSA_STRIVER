package inheritance;

public class exp2 {
    public static class  vehicle{
        public void drive(){
            System.out.println("the car is running");
        }

    }
    public static  class Car extends vehicle{
        @Override
        public void drive() {
            System.out.println("Reparing the car");
        }
    }
    public static void main(String[] args) {
//        Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

        vehicle vehicle = new vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}
