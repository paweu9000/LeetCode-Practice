class Solution {
    public int addDigits(int num) {
        while(num > 9) {
            String str = String.valueOf(num);
            int sum = 0;
            for(char c: str.toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            num = sum;
        }
        return num;
    }
}