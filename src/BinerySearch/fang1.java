package BinerySearch;

public class fang1 {

//
    public static void main(String[] args) {
//        FIND THE CELING OF THE NUMBER
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        int ans = findCeling(arr,target);
        System.out.println(ans);
    }


//    return the index of smallestt no>= target
    static int findCeling(int[]arr, int target){
        if (target>arr[arr.length-1]){

            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end - start)/2;
            if (arr[mid]<target){
                start = mid+1;
            } else if (arr[mid]>target) {
                end = mid -1;

            }else {
                return mid;
            }
        }
        return start;
    }
}
