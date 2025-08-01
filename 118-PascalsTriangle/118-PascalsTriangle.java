// Last updated: 8/1/2025, 11:57:05 AM
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);  // First element is always 1

            for (int j = 1; j < i; j++) {
                // Each number is the sum of the two numbers above it
                row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }

            if (i > 0) {
                row.add(1);  // Last element is always 1, except for the first row
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<Integer>> result = sol.generate(5);

        // Print the result
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
