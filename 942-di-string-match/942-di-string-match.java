class Solution {
    public int[] diStringMatch(String s) {
        int i = 0;
        int d = s.length();
        int[] result = new int[s.length()+1];
        for(int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == 'I') {
                result[j] = i;
                i++;
            } else {
                result[j] = d;
                d--;
            }
        }
        if(result[result.length-2] == i) {
            result[result.length-1] = d;
        } else {
            result[result.length-1] = i;
        }
        return result;
    }
}