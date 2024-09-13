package Recursion;

public class nTOevern {
    public static void main(String[] args) {
        int n = 6;
        nto1(n);
    }
    public static void nto1 (int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        nto1(n+1);

    }
}
