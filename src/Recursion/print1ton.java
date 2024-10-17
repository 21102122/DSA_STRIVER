package Recursion;

public class print1ton {
    public static void main(String[] args) {
        int n = 10;

//        meth2(n);
//        print1toN(1 , n); // Start from 1 and go up to n
    }


    public static void print1toN(int num, int n) {
        if (num ==n) {
            System.out.println(num);
            return; // Base case: stop when n reaches 0
        }
        System.out.println(num); // Print after the recursive call
        print1toN(num+1,n); // Recursive call with n-1 first

    }
    public static void meth2 (int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        meth2(n-1);
        System.out.println(n);
    }
}
