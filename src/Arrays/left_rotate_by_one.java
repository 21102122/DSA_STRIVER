package Arrays;

public class left_rotate_by_one {


    public static int left_rotate_by_one(int[] arr){
        if (arr.length==0){
            return 0;

        }

       int temp = arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;


        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");

        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("Array before rotating: ");
        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After rotaing by one place: ");
        int left = left_rotate_by_one(arr);
        System.out.println(left);

    }
}
