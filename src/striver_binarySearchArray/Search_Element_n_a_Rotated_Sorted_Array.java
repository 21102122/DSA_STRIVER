package striver_binarySearchArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Search_Element_n_a_Rotated_Sorted_Array {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int[] nums = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int n = 9, k = 1;
//        int ans = bruteforce(arr,n,k);
        int ans = searchInRotatedSortedArray(nums,k);

        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);

    }
//    public static int bruteforce(ArrayList<Integer>arr, int n , int k){
//        for (int i = 0; i <n ; i++) {
//            if (arr.get(i)==k){
//                return i;
//            }
//
//
//        }
//        return -1;
//    }

    public static int searchInRotatedSortedArray(int[] nums, int target) {

        int start =0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (nums[mid]==target){
                return mid;
            }
            if (nums[start]<=nums[mid]){
                if (nums[start]<=target && target<nums[mid]){
                    end =  mid -1;
                }else {
                    start=mid+1;
                }
            }else {

                if (nums[mid]<target && target<nums[end]){
                    start=mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
