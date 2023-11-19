class Solution {
public:
    int reductionOperations(vector<int>& nums) {
        int result = 0, len = nums.size();
        sort(nums.begin(), nums.end());
        for (int i = len-1; i > 0; i--)
        {
            if (nums[i-1] != nums[i]) result += len - i;
        }
        return result;
    }
};