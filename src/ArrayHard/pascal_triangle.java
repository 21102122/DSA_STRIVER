package ArrayHard;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
    public static void main(String[] args) {
        System.out.println(generate(5));  // Example to generate Pascal's Triangle with 5 rows
    }

    public static List<List<Integer>> generate(int numRows) {
        // Step 1: Create an empty list to store the rows
        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Handle the case when numRows is 0
        if (numRows == 0) {
            return result;
        }

        // Step 3: Add the first row to the result list
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // Step 4: Handle the case when numRows is 1
        if (numRows == 1) {
            return result;
        }

        // Step 5: Generate each subsequent row
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);

            // Start the next row
            List<Integer> row = new ArrayList<>();
            row.add(1);  // First element is always 1

            // Step 6: Fill the middle elements of the current row
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Step 7: Add the last element to the current row
            row.add(1);  // Last element is always 1

            // Step 8: Add the current row to the result list
            result.add(row);
        }

        // Step 9: Return the result list
        return result;
    }
}
