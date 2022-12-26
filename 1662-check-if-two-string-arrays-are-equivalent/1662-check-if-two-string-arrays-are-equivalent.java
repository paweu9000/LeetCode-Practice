class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = "";
        String second = "";
        for(String word: word1) {
            first += word;
        }
        for(String word: word2) {
            second += word;
        }
        return first.equals(second);
    }
}