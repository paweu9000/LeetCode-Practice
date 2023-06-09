class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result = 'Z';
        for (char c: letters) {
            if (c > target && c != target) return c;
        }
        return letters[0];
    }
}