package patterns;

public class ex14 {
    public  static void exp14(int n){
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch <'A'+i ; ch++) {
                System.out.print(ch+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        exp14(5);
    }
}
