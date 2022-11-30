class Solution {
    public boolean areNumbersAscending(String s) {
        String[] nums = s.split(" ");
        int x = Integer.MIN_VALUE;
        boolean res = true;
        for(String num: nums) {
            try {
                int y = Integer.parseInt(num);
                if(y > x) {
                    x = y;
                } else {
                    res = false;
                    break;
                }
            } catch (NumberFormatException e) {
                    
                }
            }
        return res;
    } 
}