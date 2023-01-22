class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int max = 0;
        for(char c: s.toCharArray()) {
            if(c == '(') {
                max++;
                result = Math.max(max, result);
            } else if(c == ')') max--;
        }
        return result;
    }
}