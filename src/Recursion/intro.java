package Recursion;

public class intro {
    public static void main(String[] args) {

        int n =3;
        fun3(n);
    }
    public static void fun3(int n){
        if(n==0){
            System.out.println("Happy birthday");
            return;
        }
        System.out.println("happy birthday "+n+ " days left");
        fun3(n-1);
    }
}
