package Arrays;

public class exp1 {
    public static void main(String[] args) {

        int[] arr = {2, 8, 66, 7, 9, 550};
        int target = 9;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }


    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }
}
