class Solution {
    public int countPrefixes(String[] words, String s) {
        int result = 0;
        for(String word: words) {
            for(int i = 1; i <= s.length(); i++) {
                if(word.equals(s.substring(0, i))) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}