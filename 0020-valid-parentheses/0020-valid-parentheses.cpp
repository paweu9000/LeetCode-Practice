class Solution {
public:
    bool isValid(string s) {
        stack<char> stack;
        for (char c: s) {
            if (c == '(' or c == '{' or c == '[') stack.push(c);
            else {
                if (stack.empty() 
                    or (stack.top() == '{' and c != '}') 
                    or (stack.top() == '(' and c != ')')
                    or (stack.top() == '[' and c != ']')) return false;
                stack.pop();
            }
        }
        return stack.empty();
    }
};