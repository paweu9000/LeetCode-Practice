class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num >= 0 && num <= 9) return true;
        String x = Integer.toString(num);
        if(x.lastIndexOf("0") == x.length()-1) return false;
        return true;
    }
}