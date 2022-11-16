class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for(int i = 0; i < endTime.length; i++) {
            if(queryTime <= endTime[i] && queryTime >= startTime[i]) result++;
        }
        return result;
    }
}