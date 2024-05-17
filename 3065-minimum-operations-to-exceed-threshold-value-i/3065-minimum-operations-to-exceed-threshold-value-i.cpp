class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int lower = 0;
        for (auto n: nums)
        {
            n < k ? ++lower : lower += 0;
        }
        return lower;
    }
};