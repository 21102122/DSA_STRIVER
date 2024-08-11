package basic;

public class exp15 {
//    15. Write a Java program to swap two variables.
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);

//        swapping
        int temp = a;
        a = b;
        b = temp;

        System.out.println();
        System.out.println("after swapping");
        System.out.println("a= "+a);
        System.out.println("b= "+b);



    }
}
