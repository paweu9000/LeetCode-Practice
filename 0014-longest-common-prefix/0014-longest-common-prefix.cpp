class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int n = strs.size();
        if (n==0) return "";
        
        string answer = "";
        sort(begin(strs), end(strs));
        string first = strs[0];
        string last = strs[n-1];
        
        for (int i = 0; i < first.size(); i++) {
            if (first[i] == last[i]) answer += first[i];
            else break;
        }
        return answer;
    }
};