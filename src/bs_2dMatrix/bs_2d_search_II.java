package bs_2dMatrix;

public class bs_2d_search_II {
//    leetcode
//    https://leetcode.com/problems/search-a-2d-matrix-ii/description/
//    striver problem
//    https://takeuforward.org/arrays/search-in-a-row-and-column-wise-sorted-matrix/

    public static void main(String[] args) {

        int arr[][]={{1,2,3},
                {4,5,6,} };
        int target =4;
        System.out.println(bruteForce(arr, target));
    }
//    brute force
    public static  boolean bruteForce(int arr[][],int target){

        int n  = arr.length;
        int m = arr[0].length;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]== target){
                    return true;
                }

            }

        }
        return true;

    }
}
