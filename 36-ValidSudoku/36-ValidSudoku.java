// Last updated: 8/1/2025, 11:57:48 AM
import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Arrays of sets to track numbers in each row, column, and sub-box
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        // Initialize sets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Iterate over each cell
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num = board[r][c];
                if (num == '.') {
                    continue; // Skip empty cells
                }

                // Check row
                if (rows[r].contains(num)) {
                    return false;
                }
                rows[r].add(num);

                // Check column
                if (cols[c].contains(num)) {
                    return false;
                }
                cols[c].add(num);

                // Check 3x3 sub-box
                int boxIndex = (r / 3) * 3 + (c / 3);
                if (boxes[boxIndex].contains(num)) {
                    return false;
                }
                boxes[boxIndex].add(num);
            }
        }

        // If no duplicates are found, the board is valid
        return true;
    }
}
