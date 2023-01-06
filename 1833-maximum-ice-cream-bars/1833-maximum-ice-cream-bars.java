class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int result = 0;
        int n = costs.length;
        while(result < n && costs[result] <= coins) {
            coins -= costs[result];
            ++result;
        }
        return result;
    }
}