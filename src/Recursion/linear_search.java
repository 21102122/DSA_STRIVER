package Recursion;

public class linear_search {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,99};
        System.out.println(isTargetFound(arr,0, 8 ));

    }
    public static boolean isTargetFound(int arr[], int index, int target){
        if (arr[index]== target){
            return true;
        }
        if(arr.length==index){
            return false;
        }
        return isTargetFound(arr, index+1,target);
    }
}
