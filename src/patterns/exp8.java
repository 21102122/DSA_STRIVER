package patterns;

public class exp8 {
    public static void exp8(int n){
        for (int i = 0; i <=n ; i++) {
//            space
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <2*n-(2*i+1) ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        exp8(5);
    }
}
