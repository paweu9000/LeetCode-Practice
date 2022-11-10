class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int smaller = 0;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    if(nums[j] < nums[i]) smaller++;
                }
            }
            result[i] = smaller;
        }
        return result;
    }
}