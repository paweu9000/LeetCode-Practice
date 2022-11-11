class Solution {
    public String replaceDigits(String s) {
        String result = "";
        for(int i = 0; i < s.length() -1; i+=2) {
            result += s.charAt(i);
            int asciiValue = (int)s.charAt(i);
            asciiValue += Character.getNumericValue(s.charAt(i+1));
            result += (char) asciiValue;
        }
        if(s.length()%2 != 0) result += s.charAt(s.length()-1);
        return result;
    }
}