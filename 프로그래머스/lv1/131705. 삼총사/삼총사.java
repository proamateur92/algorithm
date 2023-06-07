class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length; i++) {
            if(i + 1 > number.length) {
                break;
            }    
            
            for(int j = i + 1; j < number.length; j++) {
                int sumTwoNum = (number[i] + number[j]) * -1;

                for(int k = j + 1; k < number.length; k++) {
                    if(number[k] == sumTwoNum) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}