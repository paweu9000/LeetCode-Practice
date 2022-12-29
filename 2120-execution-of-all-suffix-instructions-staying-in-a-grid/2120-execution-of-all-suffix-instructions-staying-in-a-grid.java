class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] result = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            int moves = 0;
            int row = startPos[0];
            int col = startPos[1];
            for(int j = i; j < s.length(); j++) {
                if(s.charAt(j) == 'L') {
                    col -= 1;
                } else if(s.charAt(j) == 'R') {
                    col += 1;
                } else if(s.charAt(j) == 'U') {
                    row -= 1;
                } else {
                    row += 1;
                }
                if(row >= n || row < 0 || col >= n || col < 0) {
                    break;
                } else {
                    moves++;
                }
            }
            result[i] = moves;
        }
        return result;
    }
}