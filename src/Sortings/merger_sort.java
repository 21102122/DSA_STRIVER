package Sortings;

import java.util.ArrayList;
import java.util.Scanner;

public class merger_sort {

    private static void merge(int[]arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); //temprary array
        int left = low; // starting index of left half of arr
        int right = mid+1; // starting index of right half of arr


//        Storing element in sorted manner

        while (left<=mid && right<= high){
            if (arr[left]<= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right] );
                right++;
            }
        }
//        if element on the left array is still left
        while (left<=mid){
            temp.add(arr[left] );
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        // transfering all element to temp to arr

        for (int i = low; i <=high ; i++) {
            arr[i]=temp.get(i-low);

        }

    }
    public static void  mergeSort(int[]arr, int low, int high){
        if (low>=high)return;
        int mid= (low+high)/2;
        mergeSort(arr,low,mid);  //left half
        mergeSort(arr,mid+1,high); //right half
        merge(arr,low,mid, high); //mergint sorted value
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[]={9,4,7,6,3,1,5};
        System.out.print("Before sorted array: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
      mergeSort(arr,0,n-1);
        System.out.print("After sorting: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
}
