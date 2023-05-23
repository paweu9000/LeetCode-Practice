class Solution {
    public int smallestEqual(int[] nums) {
        int smallest = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return smallest;
    }
}