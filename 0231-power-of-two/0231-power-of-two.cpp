class Solution {
public:
    bool isPowerOfTwo(int n) {
        if (n == 1) return true;
        int x = 2;
        while (x != n)
        {
            if (x > n || x >= 1073741824) return false;
            x *= 2;
        }
        return true;
    }
};