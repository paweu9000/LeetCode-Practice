class Solution {
    public int findCenter(int[][] edges) {
        int i = edges[0][0];
        int j = edges[0][1];
        if(i == edges[1][0] || i == edges[1][1]) return i;
        if(j == edges[1][0] || j == edges[1][1]) return j;
        return -1;
    }
}