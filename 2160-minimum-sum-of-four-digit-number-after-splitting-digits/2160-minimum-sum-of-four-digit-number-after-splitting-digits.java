class Solution {
    public int minimumSum(int num) {
        char[] digits = (Integer.toString(num)).toCharArray();
        Arrays.sort(digits);
        int n = Integer.parseInt("" + digits[0] + digits[2]);
        int m = Integer.parseInt("" + digits[1] + digits[3]);
        return n+m;
    }
}