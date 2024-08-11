package ArrayHard;

import java.util.ArrayList;
import java.util.Arrays;

public class find_repeted_and_missing_value_for_1d_array {
    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> result = findMissingAndRepeated(arr);

        System.out.println("Repeated value: " + result.get(0));
        System.out.println("Missing value: " + result.get(1));
    }

    public static ArrayList<Integer> findMissingAndRepeated(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> repeatedValue = new ArrayList<>();


//        find the repeated value
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeatedValue.add(arr[i]);
                }

            }

        }
        // Assuming there's only one repeated value, add it to the result
        if (!repeatedValue.isEmpty()) {
            result.add(repeatedValue.get(0));
        } else {
            result.add(-1); // If no repeated value is found, add -1 (or handle as needed)
        }

//        sort the array
        Arrays.sort(arr);

//        remove duplicate

        ArrayList<Integer> uniqueList = new ArrayList<>();

        uniqueList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueList.add(arr[i]);
            }

        }

//        find missingg value

        for (int i = 0; i < uniqueList.size(); i++) {
            if (uniqueList.get(i + 1) != uniqueList.get(i) + 1) {
                result.add(uniqueList.get(i) + 1);
                break;

            }

        }
        // If no missing value is found within the range, handle the case where the missing value is at the end
        if (result.size() == 1) {
            result.add(uniqueList.get(uniqueList.size() - 1) + 1);
        }

        return result;
    }
}




