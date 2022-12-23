class Solution {
    public int findMaxK(int[] nums) {
        int result = -1;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(-nums[i] == nums[j] && Math.abs(nums[i]) > result) {
                    result = Math.abs(nums[i]);
                }
            }
        }
        return result;
    }
}