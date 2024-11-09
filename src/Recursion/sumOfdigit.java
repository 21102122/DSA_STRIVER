package Recursion;

public class sumOfdigit {
    public static void main(String[] args) {

        int n = 123;
        System.out.print(sumofdig(n));

    }
    public static int sumofdig(int n){
        if(n==0){
            return 0;
        }
        return sumofdig(n/10)+(n%10);

    }
}
