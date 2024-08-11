package patterns;

public class exp12 {

    public static void exp12(int n){
        int space = 2*(n-1);
        for (int i = 1; i <=n ; i++) {
//            number
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
//            space
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");

            }
//            reverse number
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);

            }
            System.out.println();
            space-=2;

        }
    }
    public static void main(String[] args) {

//        System.out.println();
        exp12(5);
    }
}
