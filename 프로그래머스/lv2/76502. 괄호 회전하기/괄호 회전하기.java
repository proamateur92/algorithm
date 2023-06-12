import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String newStr = s;
        
        // 1. 문자열 길이만큼 반복
        for(int i = 0; i < s.length(); i++) {
        
            // 2. 비교 로직 함수 호출
            if(check(newStr)) answer++;
            
            newStr = newStr.substring(1) + newStr.substring(0, 1);
        }     
        
        return answer;
    }
    
    boolean check(String s) {
            Stack<Character> st = new Stack<>();
            boolean result = false;
            
            for(char c: s.toCharArray()) {
                switch(c) {
                    case '[':
                        st.push(c);
                        break;
                    case '{':
                        st.push(c);
                        break;
                    case '(':
                        st.push(c);
                        break;
                    case ']':
                        if(st.isEmpty() || st.peek() != '[')
                            return false;
                        st.pop();
                        break;
                    case '}':
                        if(st.isEmpty() || st.peek() != '{')
                            return false;
                        st.pop();
                        break;
                    case ')':
                        if(st.isEmpty() || st.peek() != '(')
                            return false;
                        st.pop();
                        break;
                }
            }
        
            if(!st.isEmpty()) {
                return false;        
            }
        
            return true;
        }
}