class Solution {
    public int countNegatives(int[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) result++;
            }
        }
        return result;
    }
}