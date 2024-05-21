class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> res{};
        res.push_back({});
        for (auto n: nums)
        {
            int size = res.size();
            for (int j = 0; j < size; j++)
            {
                vector<int> subset {res[j]};
                subset.push_back(n);
                res.push_back(subset);
            }
        }
        return res;
    }
};