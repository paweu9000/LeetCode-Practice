class Solution {
    fun isValid(s: String): Boolean {
        var stack = Stack<Char>()
        for (c: Char in s) {
            when {
                c == '(' -> stack.push(')')
                c == '{' -> stack.push('}')
                c == '[' -> stack.push(']')
                (stack.isEmpty() || stack.pop() != c) -> return false
            }
        }
        return stack.isEmpty()
    }
}