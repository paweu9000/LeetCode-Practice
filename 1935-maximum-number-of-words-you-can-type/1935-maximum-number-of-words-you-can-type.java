class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int result = words.length;
        for(int i = 0; i < words.length; i++) {
            boolean broken = true;
            for(int j = 0; j < words[i].length(); j++) {
                if(brokenLetters.contains(Character.toString(words[i].charAt(j)))) {
                    broken = false;
                }
            }
            if(!broken) --result;
            
        }
        return result;
    }
}