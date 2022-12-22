class Solution {
    public int maximumValue(String[] strs) {
        int result = 0;
        for(String s: strs) {
            int x;
            if(s.matches("\\d+")) {
                x = Integer.parseInt(s);
            } else {
                x = s.length();
            }
            result = Math.max(x, result);
        }
        return result;
    }
}