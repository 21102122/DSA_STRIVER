package patterns;

public class exp15 {

    public static void exp15(int n){
        for (int i = 0; i <n ; i++) {
            for (char j = 'A'; j <='A'+(n-i-1) ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
exp15(5);
    }
}
