package Arrays;

import java.util.ArrayList;
import java.util.List;

public class union_of_two_sorted_array {
//    Example
//Let's consider two sorted arrays:
//
//Array A: [1, 3, 4, 5]
//Array B: [2, 3, 5, 6]
//Steps
//Initialize Pointers:
//
//Start with two pointers, i for Array A and j for Array B, both initialized to 0.
//Create an empty result array to store the union.
//Iterate Through Both Arrays:
//
//Compare elements pointed to by i and j in both arrays.
//If A[i] is smaller than B[j], add A[i] to the result and increment i.
//If B[j] is smaller than A[i], add B[j] to the result and increment j.
//If A[i] is equal to B[j], add any one of them to the result (to avoid duplicates) and increment both i and j.
//Handle Remaining Elements:
//
//Once you reach the end of one array, add all remaining elements from the other array to the result.
//Walkthrough
//Initialization:
//
//i = 0, j = 0, result = []
//First Iteration:
//
//Compare A[0] = 1 and B[0] = 2
//1 < 2, so add 1 to result and increment i
//result = [1], i = 1, j = 0
//Second Iteration:
//
//Compare A[1] = 3 and B[0] = 2
//3 > 2, so add 2 to result and increment j
//result = [1, 2], i = 1, j = 1
//Third Iteration:
//
//Compare A[1] = 3 and B[1] = 3
//3 == 3, so add 3 to result and increment both i and j
//result = [1, 2, 3], i = 2, j = 2
//Fourth Iteration:
//
//Compare A[2] = 4 and B[2] = 5
//4 < 5, so add 4 to result and increment i
//result = [1, 2, 3, 4], i = 3, j = 2
//Fifth Iteration:
//
//Compare A[3] = 5 and B[2] = 5
//5 == 5, so add 5 to result and increment both i and j
//result = [1, 2, 3, 4, 5], i = 4, j = 3
//Remaining Elements:
//
//Array A is exhausted (i = 4), so add remaining elements from Array B (starting from index j = 3) to result
//result = [1, 2, 3, 4, 5, 6]
//Final Result
//The union of Array A and Array B is [1, 2, 3, 4, 5, 6].
//
//By following these steps, you can implement the two-pointer technique for finding the union of two sorted arrays.

    public static List<Integer> union(int A[], int B[]){
        int i= 0; int j=0;
        List<Integer> result = new ArrayList<>();

        while (i<A.length && j<B.length){
            if (A[i]<B[j]){
                result.add(A[i]);
                i++;
            } else if (A[i]>B[j]) {
                result.add(B[j]);
                j++;
            } else if (A[i]==B[j]) {
                result.add(A[i] );
                i++;
                j++;

            }
        }
        while (i<A.length){
            result.add(A[i]);
            i++;
        }
        while (j<B.length){
            result.add(B[j]);
            j++;
        }
        return result;
    }
    public static void main(String[] args) {

        int[]A = {1,3,4,5};
        int[]B = {2,3,5,6};
        List<Integer>union = union(A,B);
        System.out.println(union);

    }
}
