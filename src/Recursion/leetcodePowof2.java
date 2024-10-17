package Recursion;

public class leetcodePowof2 {
    public static void main(String[] args) {


    }
    public static boolean cheack ( int n){
        if(n<=0){
            return  false;
        }
        if( n==1){
            return  true;
        }
        return (n%2==0)&& cheack(n/2);
    }

}
