class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        int ans = 0;
        for(int num : nums) {
            int amount = pairs.getOrDefault(num, 0);
            ans += amount;
            pairs.put(num, amount+1);
        }
        return ans;
    }
}