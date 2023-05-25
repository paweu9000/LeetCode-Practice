class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int lSum = 0, rSum = 0;
        for (int i: nums) rSum += i;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            rSum -= val;
            ans[i] = Math.abs(lSum - rSum);
            lSum += val;
        }
        return ans;
    }
}