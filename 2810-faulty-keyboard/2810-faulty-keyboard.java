class Solution {
    public String finalString(String s) {
        StringBuilder str = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c == 'i') {
                str = str.reverse();
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}