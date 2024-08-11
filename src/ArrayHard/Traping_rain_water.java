package ArrayHard;


//problem link: https://leetcode.com/problems/trapping-rain-water/
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Traping_rain_water {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//        System.out.println(trapApproach1(height));

//        System.out.println(trapApproach2(height));
//        System.out.println(trap(height));
    }


    public static int trapApproach2(int []height){
        if (height == null || height.length == 0) return 0;
        int leftMax = 0;
        int rightMax = 0;
        int water =0;
        int n = height.length;
        int maxHeight = height[0];
        int index =0;
        if (height == null || height.length == 0) {
            return 0;
        }
        // for find max height

        for(int i =0; i<n;i++){
            if(maxHeight<height[i]){
                maxHeight= height[i];
                index=i;
            }
        }


        // for left part

        for(int i =0; i<index; i++ ){
            if(leftMax>height[i]){
                water += leftMax-height[i];
            }else{
                leftMax = height[i];
            }
        }


        // for right part
        for(int i=n-1; i>index; i--){
            if(rightMax>height[i]){
                water+= rightMax - height[i];
            }
            else{
                rightMax =height[i];
            }
        }
        return water;

    }


//    two pointer approach
    public static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

//    time com and space comp is o(n) for approach 1
    public static int trapApproach1(int[] height) {
        if (height == null || height.length == 0) return 0;
     int []leftMax = new int[height.length];
     int []rightMax = new int [height.length];


     leftMax[0]=0;
        for (int i = 1; i < height.length ; i++) {
            leftMax[i]=Math.max(leftMax[i-1],height[i-1]);

        }

        rightMax[height.length-1]=0;
        for (int i = height.length-2; i >=0 ; i--) {
            rightMax[i]=Math.max(rightMax[i+1],height[i+1]);

        }

        int water =0;
        for (int i = 0; i < height.length; i++) {
            int minHeight = min(leftMax[i],rightMax[i]);

            if (minHeight-height[i]>=0){
                water+= minHeight-height[i];
            }

        }
        return water;
    }
}



//leetcode code
//class Solution {
//    public int trap(int[] height) {
//
//        // Approach 1
//        // create two array leftMax, rightMax, compare both find min, then min - heght
//        if (height == null || height.length == 0) {
//            return 0;
//        }
//        int[] leftMax = new int[height.length];
//        int[] rightMax = new int[height.length];
//
//        // Initialize the first element of leftMax
//        leftMax[0] = height[0];
//        for (int i = 1; i < height.length; i++) {
//            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
//        }
//
//        // Initialize the last element of rightMax
//        rightMax[height.length - 1] = height[height.length - 1];
//        for (int i = height.length - 2; i >= 0; i--) {
//            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
//        }
//
//        int water = 0;
//        for (int i = 0; i < height.length; i++) {
//            int minHeight = Math.min(leftMax[i], rightMax[i]);
//            if (minHeight > height[i]) {
//                water += minHeight - height[i];
//            }
//        }
//        return water;
//    }
//}
