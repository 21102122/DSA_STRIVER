package Array_medium;

public class setMatrix0 {

//    problem link
//    https://leetcode.com/problems/set-matrix-zeroes/description/

    public void setZero(int[][] matrix){
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        boolean rowZero = false;


//        determine which row/cols need to be zero

        for (int r = 0; r <ROWS ; r++) {
            for (int c = 0; c <COLS ; c++) {
                if (matrix[r][c]==0){
                    matrix[0][c]=0;
                    if (r>0){
                        matrix[r][0]=0;

                    }else {
                        rowZero = true;
                    }
                }

            }

        }


//        Iterate over the array again and using the first row and first column, update the element

        for (int r = 1; r <ROWS ; r++) {
            for (int c = 1; c <COLS ; c++) {
                if (matrix[0][c]== 0 || matrix[r][0]==0){
                    matrix[r][c]=0;
                }

            }

        }

        // see if the first row needs to be set to zero as well

        if (matrix [0][0]==0){
            for (int r = 0; r <ROWS ; r++) {
                matrix[r][0]=0;

            }
        }

//        see if the first col need to be set to zero as well
        if (rowZero){
            for (int c = 0; c <COLS ; c++) {
                matrix[0][c]=0;

            }
        }
    }
    public static void main(String[] args) {

        setMatrix0 sol = new setMatrix0();
        int [][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}

        };

        sol.setZero(matrix);
        for (int r = 0; r <matrix.length ; r++) {
            for (int c = 0; c <matrix[0].length ; c++) {
                System.out.print(matrix[r][c]+" ");

            }
            System.out.println();

        }

    }
}
