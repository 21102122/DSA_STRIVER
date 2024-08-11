package Arrays;

import java.util.Arrays;

public class linear {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9};
        int target = 6;

        System.out.println(linearSearch(arr,target));
    }
    public static int linearSearch(int[]arr, int target){
       if (arr.length==0){
           return -1;
       }
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if (element== target){
                return  index;
            }

        }
        return -1;
    }
}
