class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                chars.push(')');
            }
            else if (s.charAt(i) == '[') {
                chars.push(']');
            }
            else if (s.charAt(i) == '{') {
                chars.push('}');
            }
            else if (chars.isEmpty() || chars.pop() != s.charAt(i)) {
                return false;
            }
            // else {
            //     continue;
            // }
        }
        return chars.isEmpty();
    }
}        