class Solution {
    public int totalMoney(int n) {
        int sum = 1;
        int mondays = 1;
        int dayBefore = 1;
        for(int i = 1; i < n; i++) {
            if(i%7 == 0) {
                sum += ++mondays;
                dayBefore = mondays;
            } else {
                sum += ++dayBefore;
            }
        }
        return sum;
    }
}