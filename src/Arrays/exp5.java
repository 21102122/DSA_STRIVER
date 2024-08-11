package Arrays;

import java.util.Arrays;

public class exp5 {
    public static void main(String[] args) {



        int [][] arr = {{23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}};

        int target = 56;
        int []ans = new int[]{search(arr)};
        System.out.println(Arrays.toString(ans));
    }
    static int search (int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element: ints) {
                if (element >max){
                    max= element;
                }
            }

        }
        return  max;
    }

}
