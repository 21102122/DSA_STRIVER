package Arrays;

public class maxVal {
    public static void main(String[] args) {
        int[]arr = {5,9,55,33,66};
        int max = arr[0];

        for (int i = 0; i < arr.length ; i++) {

//            max = i;
            if(max <arr[i]){
                max =arr[i];
            }


        }
        System.out.println(max);

    }



}
