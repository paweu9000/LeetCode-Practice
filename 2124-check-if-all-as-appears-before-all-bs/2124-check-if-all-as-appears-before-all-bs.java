class Solution {
    public boolean checkString(String s) {
        if(s.indexOf('a') == -1) return true;
        if(s.indexOf('b') == -1) return true;
        char x = s.charAt(0);
        for(int i = 1; i < s.length(); i++) {
            if(x == 'b' && s.charAt(i) == 'a') return false;
            x = s.charAt(i);
        }
        return true;
    }
}