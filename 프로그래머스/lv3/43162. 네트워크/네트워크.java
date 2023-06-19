class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        // 컴퓨터 갯수의 false로 초기화
        boolean[] check = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            // 연결되어 있는 컴퓨터라면 네트워크 갯수 + 1
            if(!check[i]) {
                // 깊이 우선 탐색
                dfs(computers, check, i);
                answer++;
            }
        }
        
        return answer;
    }
    
    void dfs(int[][] computers, boolean[] check, int idx) {
        check[idx] = true;
        
        // 현재 컴퓨터의 다음 컴퓨터부터 체크
        for(int j = 0; j < computers.length; j++) {
            // 탐색 전인 컴퓨터이고
            // computers[i][j]가 1이면 (서로 연결된 컴퓨터라면)
            if(j != idx && check[j] == false && computers[idx][j] == 1) {
                // 깊이 우선 탐색 재귀 호출
                dfs(computers, check, j);
            }
        }
    }
}