package Recursion;

public class sumOfsquareOfn {
    public static void main(String[] args) {

        int n =3;
        System.out.println(sqofn(n));
    }
    public static int sqofn(int n){
        if(n==1){
            return 1;
        }
        return n*n + sqofn(n-1);
    }
}
