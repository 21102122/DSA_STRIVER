package basic;

public class Abstract {

    public static abstract class Animal{
        public abstract void sound();
    }
    public static class lion extends Animal{
        @Override
        public void sound() {
            System.out.println("lions roar");
        }
    }
    public  static class Tiger extends Animal{
        @Override
        public void sound() {
            System.out.println("tiger growls");
        }
    }
    public static void main(String[] args) {
//        Write a Java program to create an abstract class Animal with an
//        abstract method called sound(). Create subclasses Lion and Tiger
//        that extend the Animal class and implement the sound() method to
//        make a specific sound for each animal.

     Animal lion = new lion();
     lion.sound();
     Animal Tiger = new Tiger();
     Tiger.sound();


    }
}
