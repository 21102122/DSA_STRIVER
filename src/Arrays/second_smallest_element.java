package Arrays;

public class second_smallest_element {


    static private int secondSmallest(int arr[], int n){
        if (n<2){
            return -1;
        }

        int small = Integer.MAX_VALUE;
        int second_small= Integer.MAX_VALUE;

        for (int i = 0; i <n ; i++) {
            if (arr[i]<small){
                second_small= small;
                small= arr[i];
            }else if (arr[i]<second_small && arr[i]!=small){

                second_small=arr[i];
            }

        }
        return second_small;
    }
    static private int secondLargest(int arr[], int n){
        if (n<2){
            return -1;

        }
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if (arr[i]>large){
                second_large= large;
                large= arr[i];
            } else if (arr[i]>second_large && arr[i]!= second_large) {
                second_large = arr[i];

            }


        }
        return second_large;
    }

    public static void main(String[] args) {
        int arr[]={5,6,2,4,9,8};
        int n = arr.length;
        int sl = secondLargest(arr,n);
         int sm = secondSmallest(arr,n);
        System.out.println("second smallest in array is: "+sm);
        System.out.println("second Largest in array is: "+sl);


    }
}
