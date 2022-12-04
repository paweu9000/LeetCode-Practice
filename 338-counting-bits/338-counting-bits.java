class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            int x = 0;
            for(char c: binary.toCharArray()) {
                x += Character.getNumericValue(c);
            }
            result[i] = x;
        }
        return result;
    }
}