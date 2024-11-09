package Recursion;

public class printInreverse {
    public static void main(String[] args) {

        int n =5;
        System.out.println(rev(n));
    }
    public static int rev(int n){
        if (n==1){
            return 1;
        }
        System.out.println(n);
        return rev(n-1);
    }
}
