class Solution {
    public boolean isPalindrome(int x) {
        String result = String.valueOf(x);
        return result.equals(new StringBuilder(result).reverse().toString());
    }
}