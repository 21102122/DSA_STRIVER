package basic;

import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
//        5. Write a Java program that takes two numbers as input and displays the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125

        Scanner sc= new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();


        System.out.println("The result is : "+a*b);
    }
}
