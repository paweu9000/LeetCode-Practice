class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int chars = 97;
        for(int i = 0; i < key.length(); i++) {
            Character c = Character.valueOf(key.charAt(i));
            char b = (char) chars;
            if(!map.containsKey(c) && c != ' ') {
                map.put(c, Character.valueOf(b));
                chars++;
            }
        }
        String result = "";
        for(int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if(c != ' ') {
                result += map.get(Character.valueOf(c));
            } else if (c == ' ') {
                result += ' ';
            }
        }
        return result;
    }
}