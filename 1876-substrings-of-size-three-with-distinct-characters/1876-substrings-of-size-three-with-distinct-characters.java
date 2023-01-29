class Solution {
    public int countGoodSubstrings(String s) {
        int result = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length-2; i++) {
            if(c[i] != c[i+1] && c[i+1] != c[i+2] && c[i+2] != c[i]) result++;
        }
        return result;
    }
}