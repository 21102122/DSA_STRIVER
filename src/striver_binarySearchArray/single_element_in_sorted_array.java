package striver_binarySearchArray;

import java.util.ArrayList;
import java.util.Arrays;

public class single_element_in_sorted_array {
    public static void main(String[] args) {
        ArrayList<Integer> arr =
                new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int arr1[]={1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
//        int ans = bruteforce(arr);
        int ans2 = optimal(arr1);
        System.out.println();
//        System.out.println("The single element is: " + ans);
        System.out.println("The single element is: " + ans2);
    }

    public static int bruteforce(ArrayList<Integer>arr){
        int n = arr.size();

        if(n==0){
            return arr.get(0);
        }
        for (int i = 0; i <n ; i++) {
//            for first index
            if(i==0){
                if (!arr.get(i).equals(arr.get(i+1))) {
                    return arr.get(i);

                }
            } else if (i==n-1) {
                if (!arr.get(i).equals(arr.get(i-1))){
                    return arr.get(i);
                }

            }else {
                if (!arr.get(i).equals(arr.get(i+1)) && !arr.get(i).equals(arr.get(i-1))){
                    return arr.get(i);
                }
            }


        }
        return -1;
    }


    public static int optimal(int[] arr1) {
        int n = arr1.length;
        if (n == 1) {
            return arr1[0];
        }
        // Handle cases where unique element is at the start or end
        if (arr1[0] != arr1[1]) {
            return arr1[0];
        }
        if (arr1[n - 1] != arr1[n - 2]) {
            return arr1[n - 1];
        }

        int start = 1;
        int end = n - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the unique element
            if (arr1[mid] != arr1[mid - 1] && arr1[mid] != arr1[mid + 1]) {
                return arr1[mid];
            }

            // Determine which side to search
            if ((mid % 2 == 0 && arr1[mid] == arr1[mid + 1]) || (mid % 2 == 1 && arr1[mid] == arr1[mid - 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // In case no unique element is found
    }
}
