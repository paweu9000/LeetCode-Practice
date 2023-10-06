class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length-1, index = 0;
        while (index <= high) {
            if (nums[index] == 0) {
                nums[index] = nums[low];
                nums[low] = 0;
                low++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[high];
                nums[high] = 2;
                high--;
                index--;
            }
            index++;
        }
    }
}