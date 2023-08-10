class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int i = 0;
        for (int hour: hours) {
            if (hour >= target) ++i;
        }
        return i;
    }
}