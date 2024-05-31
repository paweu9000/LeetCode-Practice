class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        unordered_map<int, int> freq;
        for (auto &n: nums) ++freq[n];
        vector<int> result;
        for (auto &[k, v]: freq)
        {
            if (v == 1)
            {
                result.push_back(k);
                if (result.size() == 2) return result;
            }
        }
        return result;
    }
};