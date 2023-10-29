class Solution {
public:
    bool checkRecord(string s) {
        int a = 0, l = 0;
        for (char c: s)
        {
            if (c == 'L')
            {
                l++;
                if (l == 3) return false;
            }
            else if (c == 'A') 
            {
                a++;
                l = 0;
                if (a == 2) return false;
            }
            else l = 0;
        }
        return true;
    }
};