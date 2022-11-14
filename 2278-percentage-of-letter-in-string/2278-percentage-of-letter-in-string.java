class Solution {
    public int percentageLetter(String s, char letter) {
        int occurences = 0;
        for(char c: s.toCharArray()) {
            if(c == letter) occurences++;
        }
        if(occurences == 0) return 0;
        int total = (occurences*100)/s.length();
        return total;
    }
}