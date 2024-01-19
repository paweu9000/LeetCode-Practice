class Solution {
public:
    vector<int> numberGame(vector<int>& nums) {
        vector<int> arr(nums.size());
        sort(nums.begin(), nums.end());
        int bob = 0, alice = 1;
        for (int i = 1; i < nums.size(); i = i+2)
        {
            arr[bob] = nums[i];
            bob += 2;
        }
        for (int i = 0; i < nums.size(); i = i+2) 
        {
            arr[alice] = nums[i];
            alice += 2;
        }
        return arr;
    }
};