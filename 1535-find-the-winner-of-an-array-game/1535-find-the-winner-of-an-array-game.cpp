class Solution {
public:
    int getWinner(vector<int>& arr, int k) {
        int win_count = 0, current = arr[0];
        for (int i = 1; i < arr.size(); i++)
        {
            if (arr[i] > current)
            {
                current = arr[i];
                win_count = 0;
            }
            if (++win_count == k) break;
        }
        return current;
    }
};