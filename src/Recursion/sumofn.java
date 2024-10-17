package Recursion;

public class sumofn {
    public static void main(String[] args) {

        int n = 5 ;
        System.out.println(sumofn(n));
    }
    public static int sumofn (int n ){
         if ( n ==1)
         {
             return 1;
         }
         return n+sumofn(n-1);
    }
}
