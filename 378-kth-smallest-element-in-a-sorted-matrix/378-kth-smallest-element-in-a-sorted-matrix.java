import java.util.Arrays;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] ar = new int[matrix.length*matrix[0].length];
        int base = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                ar[base] = matrix[i][j];
                base += 1;
            }
        }
        Arrays.sort(ar);
        return ar[k-1];
    }
}