import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Step 1: push opening
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                // Step 2: if stack empty → invalid
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Step 3: check matching
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        // Step 4: stack should be empty
        return stack.isEmpty();
    }
}