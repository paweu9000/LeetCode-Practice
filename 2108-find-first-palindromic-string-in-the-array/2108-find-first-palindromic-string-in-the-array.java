import java.lang.StringBuilder;

class Solution {
    public String firstPalindrome(String[] words) {
        String answer = "";
        for(int i = 0; i < words.length; i++) {
            String word = (new StringBuilder(words[i])).reverse().toString();
            if(word.equals(words[i])) {
                answer = words[i];
                break;
            }
        }
        return answer;
    }
}