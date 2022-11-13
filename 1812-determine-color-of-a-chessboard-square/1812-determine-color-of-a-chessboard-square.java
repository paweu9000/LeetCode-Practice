class Solution {
    public boolean squareIsWhite(String coordinates) {
        int xAxis = coordinates.charAt(0);
        int yAxis = coordinates.charAt(1);
        if(xAxis % 2 != 0 & yAxis % 2 == 0) {
            return true;
        } else if(xAxis % 2 == 0 & yAxis % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}