package Recursion;

public class print1ton {
    public static void main(String[] args) {
        int n = 10;
        print1toN(n); // Start from 1 and go up to n
    }

    public static void print1toN(int n) {
        if (n == 0) {
            return; // Base case: stop when n reaches 0
        }
        System.out.println(n); // Print after the recursive call
        print1toN(n + 1); // Recursive call with n-1 first

    }
}
