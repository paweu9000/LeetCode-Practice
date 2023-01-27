class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> same = new ArrayList<>();
        List<Integer> more = new ArrayList<>();
        for(int i: nums) {
            if(i < pivot) {
                less.add(i);
            } else if(i > pivot) {
                more.add(i);
            } else {
                same.add(i);
            }
        }
        int x = 0;
        for(int i = 0; i < less.size(); i++) {
            nums[x] = less.get(i);
            x++;
        }
        for(int i = 0; i < same.size(); i++) {
            nums[x] = same.get(i);
            x++;
        }
        for(int i = 0; i < more.size(); i++) {
            nums[x] = more.get(i);
            x++;
        }
        return nums;
    }
}