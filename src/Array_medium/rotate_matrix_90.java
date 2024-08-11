package Array_medium;

//https://leetcode.com/problems/rotate-image/
public class rotate_matrix_90 {
    public static void main(String[] args) {

        int [][]matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotate(matrix);
        printMatrix(matrix);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

//        transpose
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
              int temp = matrix[i][j];
              matrix [i][j]= matrix[j][i];
              matrix[j][i]= temp;

            }

        }

//        reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
//
                int temp = matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]= temp;
                start++;
                end--;
            }

        }


    }

//    public static void swap(int[][] matrix, int i, int j) {
//        int temp = matrix[i][j];
//        matrix[i][j] = matrix[j][i];
//        matrix[j][i] = temp;
//    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}


// leet code soln
//class Solution {
//    public void rotate(int[][] matrix) {
//        int n = matrix.length;
//
//        // Transpose the matrix
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//
//        // Reverse each row
//        for (int i = 0; i < n; i++) {
//            int start = 0;
//            int end = n - 1;
//            while (start < end) {
//                int temp = matrix[i][start];
//                matrix[i][start] = matrix[i][end];
//                matrix[i][end] = temp;
//                start++;
//                end--;
//            }
//        }
//    }
//}