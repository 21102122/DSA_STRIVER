package inheritance;

public class exp1 {


    public static class  Animal{
        public void makeSounf(){
            System.out.println("The animal make sound.");
        }
    }


    public static class cat extends Animal{
        @Override
        public void makeSounf() {
            System.out.println("The cat qureels");
        }
    }
    public static void main(String[] args) {
//        . Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

        Animal  animal = new Animal();
        cat cat = new cat();
        animal.makeSounf();
        cat.makeSounf();
    }
}
