import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int max = 0;
        
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        
        if(priorities.length == 1) {
            return 1;
        }
        
        // 큐에 삽입
        for(int i = 0; i < priorities.length; i++) {
            q.offer(priorities[i]);
        }
        
        Arrays.sort(priorities);
        
        for(int i = 0; i <priorities.length; i++) {
            st.push(priorities[i]);
        }
        
        // 위치를 특정해서 해당 프로세스가 언제 실행되는지 체크
        // 반복문 생성
        while(!st.isEmpty()) {
            max = st.pop();

            for(int i = 0; i < q.size(); i++) {
                if(q.peek() == max) {
                    q.poll();
                    answer++;
                    
                    // 위치가 마지막에 남았다면 출력
                    if(location == 0) return answer;
                    
                    // 위치가 마지막이 아니면 한칸 당기기
                    location--;
                    break;
                } else if(q.peek() != max){
                    q.offer(q.poll());
                    
                    if(location == 0) {
                    	location = q.size() - 1;
                    } else {
                    	location--;
                    }
                    
                }
            }
        }
        return answer;
    }
}