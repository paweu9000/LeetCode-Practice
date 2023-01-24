class Solution {
    public String removeOccurrences(String s, String part) {
        String temp = "";
        int end = part.length();
        while(s.indexOf(part) != -1) {
            int start = s.indexOf(part);
            if(start != 0) {
               temp = s.substring(0, start) + s.substring(start+end, s.length()); 
            } else {
                temp = s.substring(end, s.length());
            }
            s = temp;
        }
        return s;
    }
}