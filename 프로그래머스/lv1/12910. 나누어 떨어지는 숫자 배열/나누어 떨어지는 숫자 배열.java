import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        String list = "";
        Arrays.sort(arr);
        
        for(int a : arr) {
            if(a % divisor == 0) {
                list += a + " ";
            }
        }

        String[] answerStr = list.split(" ");

        if(list.trim() == "") {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[answerStr.length];
        int i = 0;
        
        for(String s : answerStr) {
            answer[i++] = Integer.parseInt(s);    
        }
        
        return answer;
    }
}