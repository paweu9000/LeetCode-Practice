class Solution {
    public String removeTrailingZeros(String num) {
        if(!num.endsWith("0")) return num;
        else return(removeTrailingZeros(num.substring(0, num.length()-1)));
    }
}