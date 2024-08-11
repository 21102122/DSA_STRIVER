//package Arrays;
//
//public class Count_Maximum_Consecutive_One {
//    public static int count_max_consecutive_one(int[] arr, int n){
//        int current_count= 0;
//        int max_count = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i]==1){
//                current_count++;
//                max_count = Math.max(max_count,current_count);
//                }else {
//                    current_count=0;
//                }
//
//            }
//
//        return max_count;
//    }
//    }
//    public static void main(String[] args) {
//        int[] arr ={1,1,0,1,1,1,0,1,1};
//        int n =arr.length;
//        int max = count_max_consecutive_one(arr, n);
//        System.out.println(max);
//    }
//}
