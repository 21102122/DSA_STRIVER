package Array_medium;

import java.util.ArrayList;

public class rearrange_array_by_sign {
    public static void main(String[] args) {
        int arr[]={1,-3,5,-6,7,-2,4,9};
        rearrange(arr);
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
    public static void  rearrange(int arr[]){
        ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
                neg.add(arr[i] );

            }else {
                pos.add(arr[i]);
            }


        }
        int i =0; int j=0; int k =0;
        while (i< neg.size() && j< pos.size()){
            arr[k++]= neg.get(i++);
            arr[k++]=pos.get(j++);
        }
        while (i< neg.size()){
            arr[k++]=neg.get(i++);
            arr[k++]=pos.get(j++);
        }
    }
}
