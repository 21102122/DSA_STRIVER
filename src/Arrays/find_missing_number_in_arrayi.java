package Arrays;

public class find_missing_number_in_arrayi {
    public static int findMissingNumber(int arr[], int n){
        int sumExpected = n*(n+1)/2;
        int sumActual= 0;
        for (int num: arr) {
            sumActual+=num;
        }
        return sumExpected-sumActual;
    }

    public static void main(String[] args) {
        int []arr= {1,2,4,5,6};
        int n = 6;
        int missingNumber = findMissingNumber(arr,n);
        System.out.println("The missing number is: "+missingNumber);

    }
}
