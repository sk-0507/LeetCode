import java.util.HashSet;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
            {
                h.add(matrix[i][j]);
            }
        }
        if(!h.add(target)){
            return true;
        }

        return false;
    }
}