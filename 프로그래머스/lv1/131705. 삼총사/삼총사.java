class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int numLength = number.length;
        
        for(int i = 0; i < numLength - 2; i++) {
            for(int j = i + 1; j < numLength - 1; j++) {
                for(int k = j + 1; k < numLength; k++) {
                    if(number[i] + number[j] + number[k] == 0) answer++;           
                }
            }
        }
        
        return answer;
    }
}