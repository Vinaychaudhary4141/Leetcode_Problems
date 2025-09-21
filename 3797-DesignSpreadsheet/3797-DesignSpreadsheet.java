// Last updated: 9/21/2025, 7:55:01 PM
import java.util.*;

class Spreadsheet {
    private int[][] grid; 

    public Spreadsheet(int rows) {
        grid = new int[rows][26]; 
    }

    public void setCell(String cell, int value) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = value;
    }

    public void resetCell(String cell) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = 0;
    }

    public int getValue(String formula) {
        formula = formula.substring(1); 
        String[] parts = formula.split("\\+");
        return getOperandValue(parts[0]) + getOperandValue(parts[1]);
    }

    private int getOperandValue(String operand) {
        if (Character.isDigit(operand.charAt(0))) {
            return Integer.parseInt(operand);
        } else {
            int[] pos = parseCell(operand);
            return grid[pos[0]][pos[1]];
        }
    }

    private int[] parseCell(String cell) {
        char colChar = cell.charAt(0);
        int col = colChar - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1; 
        return new int[]{row, col};
    }
}
