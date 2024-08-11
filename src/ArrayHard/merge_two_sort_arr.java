package ArrayHard;

public class merge_two_sort_arr {
    public static void main(String[] args) {

    }
    public static void merge(int num1[], int m, int num2[], int n){
        int last= m+n-1;
        while(m>0 &&  n>0){
             if (num1[m-1]>num2[n-1]){
                 num1[last]=num2[m-1];
                 m--;
             }else {
                 n--;
            }
             last --;
        }
        while (n>0){
            num1[last]=num2[n-1];
            n--;
            last--;
        }
    }
}
