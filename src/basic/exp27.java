package basic;

import java.util.Scanner;

public class exp27 {
    public static void main(String[] args) {
//         Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. The integers are non-negative.
//Sample Output:
//
//Input the first number : 5
//Input the second number: 10
//Input the third number : 15
//The result is: true


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second  number: ");
        int b = sc.nextInt();
        System.out.println("Enter third  number: ");
        int c = sc.nextInt();

        System.out.print("Input a boolean value (true/false): ");
        boolean abc = sc.nextBoolean();
        System.out.print("The result is: " + test_last_digit(a, b,c, abc));

    }


    public static boolean test_last_digit(int p, int q, int r, boolean abc){
        return (p%10 == q%10)||(p%10 == r%10)||(q%10 == r%10);
    }
}
