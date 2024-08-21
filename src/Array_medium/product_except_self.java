package Array_medium;

import java.util.ArrayList;

public class product_except_self {
    public static void main(String[] args) {

        int arr[]={1,2,3,4};
//        System.out.println(product(arr));
//        System.out.println(productExceptSelf(arr));
    }

    public static ArrayList<Integer> product(int[] arr){
        int prefix = 1;
        for (int i = 0; i <= arr.length-1 ; i++) {
            prefix *= arr[i];

        }
        int newPrefix= prefix;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= arr.length-1 ; i++) {
            int i1 = newPrefix / arr[i];
            list.add(i1);


        }
        return list;
    }

        public static int[] productExceptSelf(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];
            int totalProduct = 1;
            int zeroCount = 0;

            // Calculate total product of all elements and count zeros
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    totalProduct *= arr[i];
                } else {
                    zeroCount++;
                }
            }

            // If there are more than one zero, all products except self will be zero
            if (zeroCount > 1) {
                return result; // all zeros
            }

            // Fill the result array
            for (int i = 0; i < n; i++) {
                if (zeroCount == 0) {
                    result[i] = totalProduct / arr[i];
                } else {
                    result[i] = (arr[i] == 0) ? totalProduct : 0;
                }
            }

            return result;
        }
    }


