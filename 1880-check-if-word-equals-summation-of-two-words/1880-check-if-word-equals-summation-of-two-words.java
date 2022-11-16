class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);
        
    }
    
    private int getValue(String word) {
        int val = 0;
        for(int i = 0; i < word.length(); i++) {
            val = val * 10 + (word.charAt(i) - 'a');
        }
        return val;
    }
}