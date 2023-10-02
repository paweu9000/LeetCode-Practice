class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int sum = 0;
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (new StringBuilder(words[j]).reverse().toString().equals(words[i])) ++ sum;
            }
        }
        return sum;        
    }
}