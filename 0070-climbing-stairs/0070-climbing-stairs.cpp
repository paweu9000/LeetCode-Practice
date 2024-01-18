class Solution {
public:
    int climbStairs(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        int stair[n+1];
        stair[1] = 1;
        stair[2] = 2;
        for (int i = 3; i <= n; i++)
        {
            stair[i] = stair[i-1] + stair[i-2];
        }
        return stair[n];
    }
};