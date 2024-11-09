package Recursion;

public class produt_digit {
    public static void main(String[] args) {

        int n = 1342;
        System.out.println(prod(n));

    }
    public static int prod(int n){

        if(n%10 ==n){
            return n;
        }
        return  (n%10)* prod(n/10);




    }

}
