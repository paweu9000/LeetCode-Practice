class Solution {
    fun isPalindrome(x: Int): Boolean {
        val num: String = x.toString()
        for (i in num.indices) {
            if (num[i] != num[num.length-1-i]) return false
        }
        return true
    }
}