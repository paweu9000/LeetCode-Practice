class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        code = 0
        for ch in s:
            code ^= ord(ch)
        for ch in t:
            code ^= ord(ch)
        return chr(code)
        