package Recursion;



public class printArr_rec {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(arr, 2, 5);  // Print elements from index 2 to 4
    }

    public static int print(int arr[], int index, int n) {

        // Base case: stop when index reaches n
        if (index == n) {
            return n;
        }
//        for reverse
//        if (index == -1) {
//            return;
//        }

        // Print the current element
        System.out.println(arr[index]);

        // Recursive call with incremented index

     return   print(arr, index + 1, n);


//        for reverse print
//        print(arr, index - 1, n);
    }
}


