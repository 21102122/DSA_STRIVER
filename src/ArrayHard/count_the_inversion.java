package ArrayHard;

public class count_the_inversion {
    public static void main(String[] args) {
        int[] arr={2, 3, 8, 6, 1};
        System.out.println(inversionBruteForce(arr));

    }
    public static int inversionBruteForce(int[] arr){
        int count =0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    count++;
                }

            }

        }
        return count++;
    }
}
