package BinerySearch;

import java.util.Arrays;


// facebook question



//find first and last index of target element
public class fang4 {
    public static void main(String[] args) {

        int target = 7;


        int[]arr = {5,7,7,7,8,8,10};
        System.out.println(Arrays.toString(serchRange(arr,target)));

    }
    static int[] serchRange(int[]arr, int target){
//        int start = serch(arr,target,true);
//        int end = serch(arr, target,false);
        int[] ans ={-1,-1};
//        if (start<=end){
//            ans[0]= start;
//            ans[1]= end;
        ans[0]=serch(arr,target,true);
        if (ans[0]!=-1){
            ans[1]= serch(arr,target,false);

        }
        return ans;

    }

//    this function returns the index value of target

    static int serch(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}

