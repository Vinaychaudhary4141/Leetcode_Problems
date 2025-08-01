// Last updated: 8/1/2025, 11:57:31 AM
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize board with empty spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        // Sets to track the placement of queens
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diagonals = new HashSet<>();
        Set<Integer> antiDiagonals = new HashSet<>();
        
        backtrack(0, n, board, solutions, cols, diagonals, antiDiagonals);
        return solutions;
    }

    private void backtrack(int row, int n, char[][] board, List<List<String>> solutions,
                           Set<Integer> cols, Set<Integer> diagonals, Set<Integer> antiDiagonals) {
        // Base case: if all queens are placed
        if (row == n) {
            solutions.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            int diag = row - col;
            int antiDiag = row + col;

            // Check if the column or diagonals are already occupied
            if (cols.contains(col) || diagonals.contains(diag) || antiDiagonals.contains(antiDiag)) {
                continue;
            }

            // Place the queen
            board[row][col] = 'Q';
            cols.add(col);
            diagonals.add(diag);
            antiDiagonals.add(antiDiag);

            // Move to the next row
            backtrack(row + 1, n, board, solutions, cols, diagonals, antiDiagonals);

            // Backtrack: remove the queen and unmark the sets
            board[row][col] = '.';
            cols.remove(col);
            diagonals.remove(diag);
            antiDiagonals.remove(antiDiag);
        }
    }

    private List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (char[] row : board) {
            path.add(new String(row));
        }
        return path;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4;
        List<List<String>> result = solution.solveNQueens(n);
        
        for (List<String> solutionBoard : result) {
            for (String row : solutionBoard) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
