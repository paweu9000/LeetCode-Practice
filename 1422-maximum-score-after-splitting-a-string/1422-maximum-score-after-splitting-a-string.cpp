class Solution {
public:
    int maxScore(string s) {
        int max = 0;
        if (s == "00") return 1;
        for (int i = 0; i < s.size()-1; i++) 
        {
            string left = s.substr(0, 1+i);
            string right = s.substr(1+i);
            int res = count(left.begin(), left.end(), '0') + count(right.begin(), right.end(), '1');
            max = std::max(res, max);
        }
        return max;
    }
};