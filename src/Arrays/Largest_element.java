package Arrays;

public class Largest_element {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,0};
        int max=arr[0];
        int secMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("Larget element in the array is: "+ max);
//        System.out.println("second Larget element in the array is: "+ secMax);

    }
}
