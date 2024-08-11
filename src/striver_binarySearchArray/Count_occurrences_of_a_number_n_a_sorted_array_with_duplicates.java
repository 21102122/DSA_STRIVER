package striver_binarySearchArray;

public class Count_occurrences_of_a_number_n_a_sorted_array_with_duplicates {
    public static void main(String[] args) {


        int x = 3 , arr[] = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int n = arr.length;
        System.out.println(count_occurrenceBruteForce(arr,x,n));
    }
    public static int count_occurrenceBruteForce(int arr[], int x, int n){
        int count =0;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==x){
                count++;
            }

        }
        return count;
    }

}
