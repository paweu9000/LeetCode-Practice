class Solution {
public:
    int findPermutationDifference(string s, string t) {
        int res = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s[i] == t[i]) continue;
            for (int j = 0; j < t.length(); j++)
            {
                if (s[i] == t[j])
                {
                    res += abs(i-j);
                    break;
                }
            }
        }
        return res;
    }
};