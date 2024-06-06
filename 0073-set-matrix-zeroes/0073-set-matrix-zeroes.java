public class Solution {

    public void setZeroes(int[][] matrix) {
        boolean firstRowHasZero = false, firstColHasZero = false;

        // Check if the first row or column has a zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break; // Exit early if a zero is found in the first column
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break; // Exit early if a zero is found in the first row
            }
        }

        // Set other elements based on zeros in first row or column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    // Set the corresponding elements in the first row and column to zero
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set entire row and column to zero based on marks in first row and column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set first row or column to zero if necessary
        if (firstRowHasZero) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColHasZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
