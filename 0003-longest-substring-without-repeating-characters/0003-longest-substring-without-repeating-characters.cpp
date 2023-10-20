class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length();
        int longest = 0;
        unordered_set<char> cset;
        int left = 0;
        
        for (int right = 0; right != n; right++) {
            if (cset.count(s[right]) == 0) {
                cset.insert(s[right]);
                longest = max(longest, right - left + 1);
            } else {
                while (cset.count(s[right])) {
                    cset.erase(s[left]);
                    left++;
                }
                cset.insert(s[right]);
            }
        }
        return longest;
    }
};