package Arrays;

public class linear_search {

    public static int linearSearch(int[]arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]== target){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,9,3,4};
        int target = 4;
        int a = linearSearch(arr, target);
        System.out.println(a);

    }
}
