class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        int result = Integer.MIN_VALUE;
        int key = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> set: map.entrySet()) {
            if(set.getValue() > key) {
                result = set.getKey();
                key = set.getValue();
            }
        }
        return result;
    }
}