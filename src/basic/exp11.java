package basic;

import java.util.Scanner;

public class exp11 {
//    Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586
public static void main(String[] args) {
//    area of circle = pi r*r
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of radius of circle");
    float r = sc.nextFloat();
    float rr= r*r;
    double area_circle = Math.PI*rr;

//    circumference of circle 2pir
    double perimeter_of_circle = Math.PI*r;

    System.out.println("Area of circle is: "+area_circle);
    System.out.println("Perimeter of circle is: "+perimeter_of_circle);
}
}
