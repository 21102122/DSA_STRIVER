package Arrays;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[]arr ={23,66,5,99,86};

        reverseFunc(arr);
        System.out.println(Arrays.toString(arr));
    }



    static void reverseFunc(int[]arr){
        int start = 0 ;
        int end = arr.length-1;
        while (start<end){
            swap1(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap1(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
    }
}


