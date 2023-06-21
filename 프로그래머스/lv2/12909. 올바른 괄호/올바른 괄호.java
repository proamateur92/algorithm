import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        if(s.length() % 2 == 1) {
            return false;
        }
        
        Stack<Character> st = new Stack();
        
        for(char c : s.toCharArray()) {
            if(!checkBracket(c, st)) {
                answer = false;
                break;
            }
        }
        
        // 비었으면 true
        // 안비었으면 false
        return !st.isEmpty() ? false : answer;
    }
    
    boolean checkBracket(char c, Stack<Character> st) {
        if(c == '(') {
            st.push('(');
        } else {
            if(st.isEmpty()) return false;
            if(st.pop() != '(') return false;
        }
        
        return true;
    }
}