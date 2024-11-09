package Recursion;

public class fibo {
    public static void main(String[] args) {
        int n = 4;
        int a = fib(n);
        System.out.println(a);
    }
    public static int fib(int n){
        if(n <=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
