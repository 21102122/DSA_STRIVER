package Arrays;

public class exp3 {
    public static void main(String[] args) {
        int []arr ={1,2,34,54};

        System.out.println(min(arr));
    }

    static int min(int []arr){

        if (arr.length == 0){
            return -1;
        }
        int minValue = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<minValue){
                minValue = arr[i];
            }

        }

        return minValue;
    }
}
