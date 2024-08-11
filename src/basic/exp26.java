package basic;

import java.util.Scanner;

public class exp26 {
    public static void main(String[] args) {
//        Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger than the first number.
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


        if (a<=b&& b<=c){
//            return true;
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
