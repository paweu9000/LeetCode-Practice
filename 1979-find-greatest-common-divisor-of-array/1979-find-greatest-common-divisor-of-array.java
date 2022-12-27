class Solution {
    public int findGCD(int[] nums) {
        int divisor = 1;
        Arrays.sort(nums);
        int high = nums[nums.length-1];
        int low = nums[0];
        for(int i = 1; i <= nums[0]; i++) {
            if(high % i == 0 && low % i == 0) divisor = i;
        }
        return divisor;
    }
}