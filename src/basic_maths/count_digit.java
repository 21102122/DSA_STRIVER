package basic_maths;

public class count_digit {

    public static int count_digit(int n){


        int cnt = 0;
        while (n>0){
            cnt = cnt+1;
            n = n/10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int n = 23546;
        System.out.println("N: "+n);
        int digits = count_digit(n);
        System.out.println("Number of digit in N: "+digits);

    }
}
