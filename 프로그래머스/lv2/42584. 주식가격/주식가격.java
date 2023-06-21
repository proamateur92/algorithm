import java.util.Queue;
import java.util.LinkedList;


class Solution {
    static int[] answer;
    public int[] solution(int[] prices) {
        answer = new int[prices.length];
        
        Queue<Integer> q = new LinkedList();
        
        for(int i = 0; i < prices.length; i++) {
            q.offer(prices[i]);    
        }
        
        int i = 1;
        
        while(q.size() > 0) {
            int num = q.poll();
            
            int second = 0;
            
            // j = 4
            for(int j = i; j < prices.length; j++) {
                ++second;
                
                if(num > prices[j]) {
                    answer[i-1] = second;
                    break;
                }
            }
            
            if(second == prices.length - i) answer[i-1] = second;
            
            i++;
        }   
        
        return answer;
    }
}