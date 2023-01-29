class Solution {
    public int alternateDigitSum(int n) {
        String x = n + "";
        boolean change = false;
        int result = 0;
        for(char c: x.toCharArray()) {
            if(change) {
                result -= Character.getNumericValue(c);
                change = !change;
            } else {
                result += Character.getNumericValue(c);
                change = !change;
            }
        }
        return result;
    }
}