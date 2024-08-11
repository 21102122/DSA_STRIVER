package basic;

import java.util.Scanner;

public class exp12 {
//     Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first input");
        int a = sc.nextInt();
        System.out.println("enter the second input");
        int b = sc.nextInt();
        System.out.println("enter the third input");
        int c = sc.nextInt();

        System.out.println("the average of this is: "+((a+b+c)/3));
    }
}
