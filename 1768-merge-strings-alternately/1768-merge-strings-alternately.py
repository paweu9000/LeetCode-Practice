class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        word3 = ""
        x = 0
        for i in range(len(word1)):
            word3 += word1[i]
            try:
                word3 += word2[i]
            except:
                pass
            x += 1
        
        if len(word2) > len(word1):
            word3 += word2[x:]
        
        return word3
        