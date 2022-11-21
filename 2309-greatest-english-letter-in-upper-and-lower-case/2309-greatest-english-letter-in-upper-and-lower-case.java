class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()) {
            set.add(c);
        }
        for(char c = 'Z'; c >= 'A'; c--) {
            if(set.contains(c) && set.contains(Character.toLowerCase(c))) {
                return String.valueOf(c);
            }
        }
        return "";
    }
}