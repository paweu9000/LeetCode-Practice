class Solution {
    fun lengthOfLastWord(s: String): Int {
        var len = 0
        for (i in s.indices) {
            if (len != 0 && s[s.length-1-i] == ' ') break
            if (s[s.length-1-i] == ' ') continue
            ++len
        }
        return len
    }
}