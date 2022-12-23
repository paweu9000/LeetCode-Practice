class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for(int i = 0; i < strs[0].length(); i++) {
            String prefix = String.valueOf(strs[0].charAt(i));
            for(int j = 0; j < strs.length; j++) {
                if(!strs[j].startsWith(result+prefix)) {
                    return result;
                }
            }
            result += prefix;
        }
        return result;
    }
}