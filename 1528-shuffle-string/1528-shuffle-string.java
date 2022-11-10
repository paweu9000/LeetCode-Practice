class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arrResult = new char[s.length()];
        for(int i = 0; i < indices.length; i++) {
            char c = s.charAt(i);
            arrResult[indices[i]] = c;
        }
        String result = "";
        for(char ch: arrResult) {
            result += ch;
        }
        return result;
    }
}