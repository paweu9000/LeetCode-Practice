class Solution {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        for(int i = nums.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(nums[i] - nums[j] == k) res++;
            }
        }
        return res;
    }
}