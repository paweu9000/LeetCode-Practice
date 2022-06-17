class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        ans = [s]
        for i, c in enumerate(s):
            if c.isalpha():
                ans.extend([s[:i] + s[i].swapcase() + s[i+1:] for s in ans])
        return ans                    