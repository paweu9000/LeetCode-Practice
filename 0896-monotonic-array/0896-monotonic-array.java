class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean desc = true, asc = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) desc = false;
            if (nums[i] < nums[i-1]) asc = false;
        }
        return desc || asc;
    }
}