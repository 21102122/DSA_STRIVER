package BinerySearch;

public class fang6 {
    public static void main(String[] args) {
        int []array={1,2,1};
        System.out.println(peakIndexMountainArray(array));
    }
    static int peakIndexMountainArray(int[]array){
        int start= 0;
        int end = array.length-1;

        while (start<end){
            int mid = start+(end-start)/2;
            if (array[mid]>array[mid+1]){
                end= mid;
            }else start = mid+1;
        }

        return start;
    }
}
