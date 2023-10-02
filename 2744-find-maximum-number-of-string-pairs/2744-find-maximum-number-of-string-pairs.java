class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int sum = 0;
        for (int i = words.length-1; i > 0; i--) {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            for (int j = i-1; j >= 0; j--) {
                if (words[j].equals(reversed)) ++ sum;
            }
        }
        return sum;        
    }
}