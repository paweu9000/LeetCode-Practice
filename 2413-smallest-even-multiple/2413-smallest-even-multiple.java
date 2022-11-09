class Solution {
    public int smallestEvenMultiple(int n) {
        int result = 0;
        for(int i = 1; i <= 10000; i++) {
            if(i%2 == 0 && i%n == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}