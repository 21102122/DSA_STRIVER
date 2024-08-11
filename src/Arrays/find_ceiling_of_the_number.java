package Arrays;

public class find_ceiling_of_the_number {

    public static int ceiling_of_the_number(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target <arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }

        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {-18,-12,-4,0,2,3,4,15,18,22,45,86};
        int target =14;
        int ans = ceiling_of_the_number(arr,target);
        System.out.println(ans);

    }
}
