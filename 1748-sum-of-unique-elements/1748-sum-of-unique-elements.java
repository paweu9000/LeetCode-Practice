import java.util.HashMap;

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) +1);
            } else {
                map.put(num, 1);
            }
        }
        int sum = 0;
        for(Map.Entry entry: map.entrySet()) {
            if(Integer.valueOf((int)entry.getValue()) == 1) {
                sum += Integer.valueOf((int)entry.getKey());
            }
        }
        return sum;
    }
}