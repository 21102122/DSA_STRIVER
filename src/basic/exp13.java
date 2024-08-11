package basic;

import java.util.Scanner;

public class exp13 {
    //        Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5
//
//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of width");
        float width = sc.nextFloat();
        System.out.println("Enter the value of length");
        float length = sc.nextFloat();

//         Area of rectangle
        float area_rectangle = width*length;
        System.out.println("Area of rectangle is: "+area_rectangle);

//      perimeter of rectangle
        float perimeter_rectangle = 2*(length*width);
        System.out.println("Perimeter of Rectangle is: "+perimeter_rectangle);

    }
}
