package basic;

import java.util.Scanner;

public class exp28 {
    public static void main(String[] args) {
//        Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.
//Sample Output:
//
//Input the first number : 35
//Input the second number: 45
//Result: true


        Scanner sc = new Scanner(System.in);
        System.out.println("input the first number");
        int num1 = sc.nextInt();
        System.out.println("input the second number");
        int num2 = sc.nextInt();


        if (num1<25||num1>75||num2<25||num2>75){
            System.out.println("both number should be  between 25 to 75");

        }else {
            boolean result = hasCommonDigit(num1,num2);
            System.out.println("the result is: "+result);
        }

    }
    public static boolean hasCommonDigit(int num1, int num2){

        int digit1,digit2;


        while (num1>0){
            digit1=num1%10;
            int temp = num2;
            while (temp>0){
                digit2= temp%10;

                if (digit1==digit2){
                    return true;
                }
                temp/=10;
            }
            num1/=10;
        }
        return false;
    }
}
