class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, 0, target, 0);
        
        return answer;
    }
    
    void dfs(int[] numbers, int depth, int target, int sum) {
        if(numbers.length == depth) {
            if(target == sum) {
                answer++;
            }
            return;
        }
        
        dfs(numbers, depth + 1, target, sum + numbers[depth]);
        dfs(numbers, depth + 1, target, sum - numbers[depth]);
    }
}