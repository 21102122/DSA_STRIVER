package Array_medium;

import java.util.ArrayList;


//problem statement
//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array
public class Leaders_in_array {
    public static void main(String[] args) {
        int arr[]={4,7,1,0};
        int n = arr.length;
        printLeaders(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");

        }

    }
    public static ArrayList<Integer> printLeaders (int arr[], int n){
        ArrayList<Integer> Leaders = new ArrayList<>();
        int max = arr[n-1];
        Leaders.add(arr[n-1] );
        for (int i = n-1; i >=0 ; i--) {
            if (arr[i]>max){
                Leaders.add(arr[i] );
                max = arr[i];
            }

        }
        return Leaders;

    }
}
