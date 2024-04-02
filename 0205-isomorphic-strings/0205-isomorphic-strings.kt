class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length <= 1) return true
        val map = mutableMapOf<Char, Char>()
        for (i in s.indices) {
            val a = s[i]
            val b = t[i]
            if (map.containsKey(a)) {
                if (map.get(a) == b) continue
                else return false
            } else {
                if (!map.containsValue(b)) map[a] = b
                else return false
            }
        }
        return true
    }
}