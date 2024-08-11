package Array_medium;

import java.util.ArrayList;
import java.util.List;

//import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;

public class spiral_matrix {
    public static void main(String[] args) {
        int [][]matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        List<Integer>result = spiralOrder(matrix);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)+" ");

        }
        System.out.println();


    }

    public  static  List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;


        int top=0;
        int left =0;
        int right =m-1;
        int bottom = n-1;


        while(top<=bottom  && left<=right){
            // left to right
            for(int i =left; i<=right; i++){
                ans.add(matrix[top][i]);

            }
            top++;
            //  top to bottom
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);


            }
            right--;
            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    ans.add(matrix[bottom][i]);

                }
                bottom--;
            }

            if(left<=right){
                for(int i =bottom; i>=top; i--){
                    ans.add(matrix[i][left]);

                }
                left++;
            }

        }
        return ans;
    }
}
