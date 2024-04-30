class Solution {
public:
    long long wonderfulSubstrings(string word) {
        int count[1024];
        count[0] = 1;
        long answer = 0;
        for (int pm = 0, n = word.length(), i = 0; i < n; ++i)
        {
            pm ^= 1 <<(word[i] - 'a');
            for (int b = 1; b < 1024; b <<= 1) answer += count[pm ^ b];
            answer += count[pm]++;
        }
        return answer;
    }
};