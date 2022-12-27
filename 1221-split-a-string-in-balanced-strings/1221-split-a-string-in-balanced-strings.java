class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == 'L' ? 1 : -1;
            if(count == 0) result++;
        }
        return result;
    }
}