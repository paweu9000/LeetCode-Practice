class Solution {
    public int maxProductDifference(int[] nums) {
        int minDiff = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(j != i) {
                    int x = nums[i]*nums[j];
                    if(x > maxDiff) maxDiff = x;
                    if(x < minDiff) minDiff = x;
                }
            }
        }
        return maxDiff - minDiff;
    }
}