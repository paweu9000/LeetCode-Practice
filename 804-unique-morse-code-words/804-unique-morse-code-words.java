class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> result = new HashSet<>();
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....",
                                      "..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-"
                                          ,"..-","...-",".--","-..-","-.--","--.."};
        for(String word: words) {
            String toMorse = "";
            for(char c: word.toCharArray()) {
                int pos = (int)c - 97;
                toMorse += morse[pos];
            }
            result.add(toMorse);
        }
        return result.size();
    }
}