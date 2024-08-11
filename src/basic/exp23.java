package basic;

import java.util.Scanner;

public class exp23 {
    public static void main(String[] args) {
//        Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//Sample Output:

        int n ;
        char s1,s2,s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit: ");
        n = sc.nextInt();

        System.out.printf("%d +  %d%d  +  %d%d%d",n, n,n,n,n,n);
    }
}
