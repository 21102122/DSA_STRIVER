package patterns;

public class exp13 {
    public static void exp13(int n){



        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num = num+1;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        exp13(5);
    }
}
