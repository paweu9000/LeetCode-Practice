class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums) {
            String s = i + "";
            set.add(i);
            if(s.length() >= 2) set.add(Integer.parseInt(new StringBuilder(s).reverse().toString()));
        }
        return set.size();
    }
}