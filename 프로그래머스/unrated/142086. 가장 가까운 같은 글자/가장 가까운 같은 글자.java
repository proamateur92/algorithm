import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
                
        HashMap<Character, Integer> map = new HashMap<>();
        char[] sArr = s.toCharArray();
        
        for(int i = 0; i < sArr.length; i++) {
            if(map.get(sArr[i]) == null) {
                map.put(sArr[i], i);
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(sArr[i]);
                map.put(sArr[i], i);
            }
        }
        
        return answer;
    }
}