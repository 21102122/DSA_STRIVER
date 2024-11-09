package Capegemenii;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class SpiralMat {
    public static void main(String[] args) {
        int [][]matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        List<Integer>result = spiral(matrix);
        for (int i = 0; i <result.size() ; i++) {
            System.out.print(result.get(i)+" ");

        }
        System.out.println();
    }
    public static List<Integer> spiral(int mat [][]){
        List<Integer>ans = new ArrayList<>();

        int n = mat.length; int m = mat[0].length;
        int top =0 ; int bottom = n-1; int right =m-1 ; int left =0 ;

//        print spiral
        while ( top <= bottom && left<=right ){

//            move left to righ
            for (int i =left ; i <=right ; i++) {
                ans.add(mat[top][i]);


            }
            top++;

//            move top to bottom
            for (int i = top; i <=bottom ; i++) {
                ans.add(mat[i][right]);



//
            }
            right--;
//            move  right to left
            if(top<= bottom){
                for (int i = right; i >=left ; i--) {
                    ans.add(mat[bottom][i]);


                }
                bottom--;
            }
            if (left<= right){
                for (int i = bottom; i >=top ; i--) {
                    ans.add(mat[i][left]);


                }
                left++;
            }

        }
        return ans;
    }
}
