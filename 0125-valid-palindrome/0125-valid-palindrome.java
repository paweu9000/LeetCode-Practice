class Solution {
    public boolean isPalindrome(String s) {
        String sNormal =  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = sNormal.length() - 1;
        while(i <= j ) {
            if(sNormal.charAt(i) != sNormal.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }
}