package Arrays;

public class two_sumProblem {
    public static int[] twoSumProb(int[] arr, int target){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    return new int []{i,j};
                }

            }

        }return null;
    }
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6};
        int target = 10;
        int[] ans = twoSumProb(arr,target);
        System.out.println(ans);
        if(ans!=null){
            System.out.println("Indices "+ans[0]+","+ans[1]);
        }else {
            System.out.println("No solution found");
        }

    }
}
