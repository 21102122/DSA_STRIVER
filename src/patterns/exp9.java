package patterns;

public class exp9 {

    public static void exp9(int n){
        for (int i = 0; i <n ; i++) {
//            space  n-i-1
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");

            }
//            star 2*i+1
            for (int j = 0; j <2*i-1 ; j++) {
                System.out.print("*");

            }
//            space  n-i-1
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");

            }
            System.out.println();



        }
        for (int i = 0; i <

                n ; i++) {
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

        exp9(5);
    }
}
