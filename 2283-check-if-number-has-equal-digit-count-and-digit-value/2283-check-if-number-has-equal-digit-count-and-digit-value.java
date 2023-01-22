class Solution {
    public boolean digitCount(String num) {
        int[] count = new int[11];
        char[] chars = num.toCharArray();
        for(char c: chars) {
            ++count[c-'0'];
        }
        for(int i = 0; i < chars.length; i++) {
            if(count[i] != chars[i] - '0') return false;
        }
        return true;
    }
}