package patterns;

public class exp10 {
    public static void exp10(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j<i ; j++) {
                System.out.print("*");

            }

            System.out.println();
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    public static void main(String[] args) {

        exp10(5);
    }
}
