package basic;

import java.util.Scanner;

public class EXP17 {
    public static void main(String[] args) {
//         Write a Java program to convert an integer number to a binary number.
//Input Data:
//Input a Decimal Number : 5
//Expected Output
//
//Binary number is: 101


        int dec_num, quot, i = 1,j;
        int bin_num[]= new int[100];


        Scanner sc = new Scanner(System.in);
        System.out.println("Input a decimal number");
        dec_num = sc.nextInt();

        quot = dec_num;
        while (quot != 0){
            bin_num[i++]= quot%2;
            quot = quot/2;
        }
        System.out.println("binary number is: ");
        for (j=i-1; j>0;j--){
            System.out.print(bin_num[j]);
        }
        System.out.println("\n");


    }
}
