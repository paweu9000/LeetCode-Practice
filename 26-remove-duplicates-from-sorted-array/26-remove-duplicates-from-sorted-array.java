class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num: nums) {
            set.add(num);
        }
        int x = 0;
        for(Integer i: set) {
            nums[x] = i;
            x++;
        }
        return set.size();
    }
}