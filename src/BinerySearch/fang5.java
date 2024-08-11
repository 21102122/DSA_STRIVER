package BinerySearch;



//amazon
//find position of an element in a sorted array of infinite numbers

public class fang5 {
    public static void main(String[] args) {

        int[] arr={2,12,85,95,100,120,130};
        int target = 95;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        int start =0;
        int end = 1;


        while (target>arr[end]){
            int temp = end+1;
            end = end+(end-start+1)*2;
            start= temp;
        }
        return amazon(arr,target,start,end);

    }

    static int amazon(int[]arr, int target,int start,int end){
//        int start = 0;
//        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
