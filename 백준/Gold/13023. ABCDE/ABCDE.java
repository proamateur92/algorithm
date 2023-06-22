import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
	static boolean[] visited;
	static ArrayList<Integer>[] A;
	static boolean arrive = false;
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		// 노드 갯수
		int N = Integer.parseInt(st.nextToken());
		// 에지 갯수
		int M = Integer.parseInt(st.nextToken());
		
		// 방문 기록을 저장할 배열 생성
		visited = new boolean[N];
		
		// 각 연결된 노드를 기억할 리스트 생성
		A = new ArrayList[N];
				
		for(int i = 0; i < N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			A[u].add(v);
			A[v].add(u);
		}
		
		for(int i = 0; i < N; i++) {
			dfs(i, 1);
			
			if(arrive) {
				break;
			}
		}
		
		System.out.println(arrive ? 1 : 0);
	}
	
	static void dfs(int n, int depth) {
		if(depth == 5 || arrive) {
			arrive = true;
			return;
		}
		
		visited[n] = true;
		
		for(int i : A[n]) {
			if(!visited[i]) {
				dfs(i, depth + 1);
			}
		}
		
		visited[n] = false;
	}
}
