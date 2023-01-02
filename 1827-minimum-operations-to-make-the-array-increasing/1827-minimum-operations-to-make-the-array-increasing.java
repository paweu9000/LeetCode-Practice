class Solution {
    public int minOperations(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] >= nums[i+1]) {
                int diff = nums[i] - nums[i+1] + 1;
                result += diff;
                nums[i+1] = nums[i+1] + diff;
            }
        }
        return result;
    }
}