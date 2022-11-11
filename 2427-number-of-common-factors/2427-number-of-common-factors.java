class Solution {
    public int commonFactors(int a, int b) {
        int maxDivide = a > b ? b : a;
        int result = 0;
        for(int i = 1; i <= maxDivide; i++) {
            if(a%i == 0 && b%i == 0) result++;
        }
        return result;
    }
}