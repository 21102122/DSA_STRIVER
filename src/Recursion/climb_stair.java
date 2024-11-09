package Recursion;

public class climb_stair {
    public static void main(String[] args) {
//        int n =3;
//        int  a = stair(n);
//        int b = rec(n);
////        System.out.println(a);

//        System.out.println(b);
    }
    public static int stair(int n ){
        if(n==1){
            return  1;
        }
        int first =1;
        int second =2;
        if (n==2) {
            return second;

        }

        int current =0;
        for (int i = 3; i <=n ; i++) {
            current = first+second;
            first=second;
            second= current;

        }
        return current;
    }
//    using recursive approach

    public static int rec(int n){
         if(n==1){
             return 1;
         }
         return rec(n-1)+rec(n-2);
    }
}
