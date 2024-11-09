package Recursion;

public class sum_of_element {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(arr,0,5 ));

    }
    public static int sum(int arr[], int index, int n){
        if(index == n){
            return 0;

        }
        return arr[index]+sum(arr,index+1,n);
    }
}
