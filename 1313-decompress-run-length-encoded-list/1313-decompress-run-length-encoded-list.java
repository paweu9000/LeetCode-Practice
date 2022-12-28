class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i+=2) {
            int freq = nums[i];
            int val = nums[i+1];
            for(int j = 1; j <= freq; j++) {
                list.add(val);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}