class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;
        for(int i = nums.length-1; i >= 0; i--) {
            int triplet = 0;
            for(int j = 0; j < nums.length; j++) {
                if(j != i) {
                    if(nums[j] - nums[i] == diff || nums[i] - nums[j] == diff) triplet++;
                }
            }
            if(triplet == 2) result++;
        }
        return result;
    }
}