class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        int sum = map.get(s.charAt(0));
        for(Map.Entry<Character, Integer> set: map.entrySet()) {
            if(set.getValue() != sum) return false;
        }
        return true;
    }
}