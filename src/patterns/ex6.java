package patterns;

public class ex6 {

    public static void  ex6(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 1; j <n-i+1 ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {

        ex6(5);
    }
}
