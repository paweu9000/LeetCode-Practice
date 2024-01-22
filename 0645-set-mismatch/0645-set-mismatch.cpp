class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n = nums.size();
        int actual_sum = n * (n+1) / 2;
        int array_sum = 0;
        int unique_sum = 0;
        unordered_set<int> n_set(nums.begin(), nums.end());
        
        for (int i: n_set)
        {
            unique_sum += i;
        }
        for (int i: nums)
        {
            array_sum += i;
        }
        
        return {(array_sum - unique_sum), (actual_sum-unique_sum)};
    }
};