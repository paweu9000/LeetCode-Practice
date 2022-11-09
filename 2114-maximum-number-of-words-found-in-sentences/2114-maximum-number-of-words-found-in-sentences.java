class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for(int i = 0; i < sentences.length; i++) {
            int x = 1;
            for(int j = 0; j < sentences[i].length(); j++) {
                if(sentences[i].charAt(j) == ' ') {
                    x += 1;
                }
            }
            if (x > result) result = x;
        }
        return result;
    }
}