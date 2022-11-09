class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation: operations) {
            if(operation.equals("X++") || operation.equals("++X")) {
                x += 1;
            } else {
                x -= 1;
            }
        }
        return x;
    }
}