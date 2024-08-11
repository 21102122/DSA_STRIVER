package basic;

public class exp29 {

//    Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2.
//Test Data: array = 50, -20, 0, 30, 40, 60, 10
//Sample Output:
//
//false

    public static void main(String[] args) {

        int[]num_array ={10,20,30,10};
        boolean result = (num_array.length>=2&& num_array[0]== num_array[num_array.length-1]);
        System.out.println(result);
    }
}
