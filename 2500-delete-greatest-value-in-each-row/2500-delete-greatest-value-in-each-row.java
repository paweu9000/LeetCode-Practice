class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        int result = 0;
        for(int i = 0; i < grid[0].length; i++) {
            int maximum = 0;
            for(int j = 0; j < grid.length; j++) {
                maximum = Math.max(maximum, grid[j][i]);
            }
            result += maximum;
        }
        return result;
    }
}