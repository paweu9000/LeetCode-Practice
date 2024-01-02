class Solution {
public:
    vector<vector<int>> findMatrix(vector<int>& nums) {
        vector<int> count(nums.size()+10);
        vector<vector<int>> result;
        for (auto n: nums) {
            if (result.size() <= count[n]) result.push_back({});
            result[count[n]++].push_back(n);
        }
        return result;
    }
};