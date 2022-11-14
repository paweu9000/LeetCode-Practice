import java.util.HashMap;

class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> amount = new HashMap<>();
        char result = 'a';
        for(int i = 0; i < s.length(); i++) {
            if(amount.containsKey(s.charAt(i))) {
                result = s.charAt(i);
                break;
            } else {
                amount.put(s.charAt(i), 1);
            }
        }
        return result;
    }
}