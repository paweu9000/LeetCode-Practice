class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())) {
            return true;
        } else if(word.equals(word.toLowerCase())) {
            return true;
        } else if(Character.isUpperCase(word.charAt(0)) && word.substring(1, word.length()).equals(
        word.substring(1, word.length()).toLowerCase())) {
            return true;
        }
        return false;
    }
}