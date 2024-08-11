package basic;

import java.util.Scanner;

public class exp18 {
    public static void main(String[] args) {
        int dec_num, rem;
        String hexdec_num = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


        Scanner sc = new Scanner(System.in);
        System.out.println("input a decimal number");
        dec_num = sc.nextInt();

        while (dec_num > 0) {
            rem = dec_num % 16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num / 16;

        }
        System.out.print("Hexadecimal numberf is: "+hexdec_num+"\n");
    }
}

