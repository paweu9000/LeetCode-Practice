class Solution {
    public int maximum69Number (int num) {
        String digits = num + "";
        int x = digits.indexOf("6");
        char[] chars = digits.toCharArray();
        if(x != -1) {
            chars[x] = '9';
            digits = String.valueOf(chars);
        }
        return Integer.parseInt(digits);
    }
}