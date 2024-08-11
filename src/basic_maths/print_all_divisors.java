package basic_maths;

public class print_all_divisors {
    public static void printAllDivisor(int n){
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                System.out.println(i+" ");
            }

        }

    }
    public static void main(String[] args) {

        printAllDivisor(36);
    }
}
