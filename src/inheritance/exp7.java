package inheritance;

public class exp7 {
//    Write a Java program to create a class called Shape with methods called
//    getPerimeter() and getArea(). Create a subclass called Circle that overrides
//    the getPerimeter() and getArea() methods to calculate the area and perimeter
//    of a circle.

    public static  class  Shape{
      double Perimeter, Area;

        public double getPerimeter() {
            return 0.0;
        }

        public double getArea() {
            return 0.0;
        }
    }
    public static class circle extends Shape{
        private double radius;

        public circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI*radius*radius;
        }

        @Override
        public double getPerimeter() {
            return 2*Math.PI*radius;
        }
    }
    public static void main(String[] args) {

        double r = 8.0;
        circle c1 = new circle(r);
        System.out.println("radius of the circle is: "+r);
        System.out.println("perimeter of the circle is: "+c1.getPerimeter());
        System.out.println("area of the circle is: "+c1.getArea());
    }
}
