package patterns;

public class exp5 {
// *  *  *  *  *
// *  *  *  *
// *  *  *
// *  *
// *
    public static  void exp5(){
        int n =5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <n-i+1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        exp5();
    }
}
