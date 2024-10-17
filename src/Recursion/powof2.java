package Recursion;

public class powof2
{
    public static void main(String[] args) {
        int num =2;
        int n = 5;
        System.out.println(powof2(num, n));

    }
    public static  int powof2( int num, int n ){
         if (n == 0){
             return num;
         }
         return num * powof2(num, n-1);
    }
}
