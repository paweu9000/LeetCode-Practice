class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int x = nums.length-1;
        int y = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0) {
                res[y] = nums[i];
                y++;
            } else {
                res[x] = nums[i];
                x--;
            }
        }
        return res;
    }
}