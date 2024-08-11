package Array_medium;

public class transpose_matrix {
    public static void main(String[] args) {

        int [][]matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
       transpose(matrix);
       printMatrix(matrix);

    }
    public static void transpose(int [][]matrix){

        for (int i = 0; i < matrix.length-1 ; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                swap(matrix, i, j);
            }

        }

    }
    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static void printMatrix(int [][]matrix){
        for (int[]row:matrix){
            for (int value : row){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
