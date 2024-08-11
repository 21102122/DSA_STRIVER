package basic;

import java.util.Scanner;

public class exp30 {
    public static void main(String[] args) {

//        Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
//Sample Output:
//
//Original Array: [5, 7]
//true
        int[] arr = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element");
        for (int i = 0; i<arr.length; i++) {
            arr[i]= sc.nextInt();

        }

        boolean contain4or7 = false;
        for (int i = 0; i < args.length; i++) {
            if (arr[i]==4 || arr[i]==7){
                contain4or7 = true;
                        break;
            }

        }

        System.out.print("Original Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


//
        System.out.println(contain4or7);

    }
}
