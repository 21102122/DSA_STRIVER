package Recursion;

public class print1_to_n {
    public static void main(String[] args) {
        int n =5;
   print(n);
    }
    public static void print(int n){
        if(n==0){
            return ;
        }
        print(n-1);
        System.out.print(n+" ");;

    }
}
