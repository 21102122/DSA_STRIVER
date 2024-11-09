package Recursion;

public class both {
    public static void main(String[] args) {
        int n =5;
        funboth(n);
    }
    public static void funboth(int n){
        if (n==0){
            return ;
        }
        System.out.print(n+" ");
        funboth(n-1);
        System.out.print(n+" ");
    }
}
