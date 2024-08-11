package Arrays;

import java.util.Arrays;

public class exp6 {
    public static void main(String[] args) {

        int []arr ={12,345,2,6,7896};

        System.out.println(even(arr));
    }
    static int even(int []arr){
        int[] even = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==0){
                even[count] = arr[i];
                count++;
            }

        }
        even = Arrays.copyOf(even,count);

        int sum = 0;
        for (int num:even){
            sum+=num;
        }
        return sum;
    }
}
