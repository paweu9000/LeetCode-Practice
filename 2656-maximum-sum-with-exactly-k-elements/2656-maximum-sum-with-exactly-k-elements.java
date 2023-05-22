class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int lastIndex = nums.length-1;
        int result = 0;
        for (int i = 1; i <= k; i++) {
            int num = nums[lastIndex];
            result += num;
            nums[lastIndex] = ++num;
        }
        return result;
    }
}