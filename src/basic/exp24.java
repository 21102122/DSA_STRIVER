package basic;

import java.util.Scanner;

public class exp24 {
    public static void main(String[] args) {
//         Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
//Sample Output:
//
//Input a number: 20
//1

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();


        if (a%2==0){
            System.out.println("The "+a+" is even number");

        }else {
            System.out.println("The "+a+" is odd number");
        }
    }
}
