package Arrays;

public class exp2 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int target = 6;
        System.out.println(linearSearch(arr,target));
    }

    public static int linearSearch(int []arr, int target){
        if (arr.length==0){
            return -1;
        }

        for (int i = 1; i < 4; i++) {
            int element = arr[i];
            if (element==target){
                return i;
            }

        }
        return -1;
    }
}
