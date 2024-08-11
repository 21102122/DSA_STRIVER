package inheritance;

public class exp3 {
    public static class  Shape{
        public double getArea(){
           return  0.0;
        }
    }
    public static class Rectangle extends Shape{

        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double getArea() {
            return length*width;
        }
    }
    public static void main(String[] args) {
//        Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

        Rectangle rectangle = new Rectangle(3.2,1.2);
        double area = rectangle.getArea();
        System.out.println("the area of the rectangle is: "+ area);
    }
}
