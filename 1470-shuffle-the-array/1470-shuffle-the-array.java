class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n*2];
        boolean x = true;
        int y = 0;
        for(int i = 0; i < nums.length; i++) {
            x = !x;
            if(x) {
                result[i] = nums[n];
                n++;
            } else {
                result[i] = nums[y];
                y++;
            }
        }
        return result;
    }
}