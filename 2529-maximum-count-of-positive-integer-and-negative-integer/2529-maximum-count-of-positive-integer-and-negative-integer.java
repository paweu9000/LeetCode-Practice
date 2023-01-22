class Solution {
    public int maximumCount(int[] nums) {
        int min = 0, max = 0;
        for(int num: nums) {
            if(num > 0) max++;
            if(num < 0) min++;
        }
        return Math.max(min, max);
    }
}