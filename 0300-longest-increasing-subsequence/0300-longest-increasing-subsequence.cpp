class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        vector<int> result;
        for (int i = 0; i < nums.size(); i++)
        {
            auto iter = std::lower_bound(result.begin(), result.end(), nums[i]);
            if (iter == result.end()) result.push_back(nums[i]);
            else *iter = nums[i];
        }
        return result.size();
    }
};