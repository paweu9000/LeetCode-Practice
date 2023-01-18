class Solution {
    public int differenceOfSum(int[] nums) {
        int element = 0;
        int digit = 0;
        
        for(int i: nums) {
            element += i;
            if(i <= 9) {
                digit += i;
            } else {
                String num = "" + i;
                for(int j = 0; j < num.length(); j++) {
                    digit += Character.getNumericValue(num.charAt(j));
                }
            }
        }
        return element - digit;
    }
}