package ArrayHard;

public class three_sum {
    public static void main(String[] args) {

        int arr[]={-1,0,1,2,-1,-4};
        int target =3;
        int n = arr.length;

    }
    public static boolean answer(int []arr, int target,int n){
        for (int i = 0; i <n-2 ; i++) {
            int ans = target-arr[i];
            int start = i+1;
            int end =n-1;
            while (start<end){
                if (arr[start]+arr[end]== ans){
                    return true;
                } else if (arr[start]+arr[end]>ans) {
                    end--;

                }
                else{
                    start++;
                }
            }

        }
        return false;
    }
}
//        approach 1
//        for (int i = 0; i < arr.length-2 ; i++) {
//            for (int j = i+1; j < arr.length-1; j++) {
//                for (int k = j+1; k < arr.length; k++) {
//                    if (arr[i]+arr[j]+arr[k]== target){
//                        System.out.println("yes");;
//
//                    }
//
//                }
//
//            }
//    }
//        System.out.println(false);
//    public static int  approach2(int arr[], int target){
//
//
//        }
//        return 0;
//    }
