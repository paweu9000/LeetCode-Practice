class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());
        
        int result = 0;
        
        for (int i = 0; result < g.size() && i < s.size(); i++)
        {
            if (s[i] >= g[result]) result++;
        }
        return result;
    }
};