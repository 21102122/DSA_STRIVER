package Arrays;

public class check_array_is_sorted {
    public static  boolean check_sorted(int arr[], int n){
        for (int i = 1; i <n ; i++) {
            if (arr[i]<arr[i-1]){
                return false;
            }

        }

        return true;
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5}, n = arr.length;

        System.out.println(check_sorted(arr, n));
    }
}
