// Last updated: 8/1/2025, 11:57:03 AM
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // Start from the second last row and go upwards
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                triangle.get(row).set(col, triangle.get(row).get(col) + 
                    Math.min(triangle.get(row + 1).get(col), triangle.get(row + 1).get(col + 1)));
            }
        }
        
        // The top element now contains the minimum path sum
        return triangle.get(0).get(0);
    }
}
