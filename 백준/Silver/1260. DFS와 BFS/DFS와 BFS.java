import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] A;
	static String answerDFS = "";
	static String answerBFS = "";
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n + 1];
		
		A = new ArrayList[n + 1];
		
		for(int i = 1; i <= n; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(bf.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			A[s].add(e);
			A[e].add(s);
		}
		
		for(int i = 1; i <= n; i++) {
			Collections.sort(A[i]);
		}
		
		dfs(v);
		
		Arrays.fill(visited, false);
		
		bfs(v, n);
		
		System.out.println(answerDFS.trim());
		System.out.println(answerBFS.trim());
	}
	
	static void bfs(int start, int nodeNum) {
		List<Integer> finishList = new ArrayList<>();
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(start);
		
		while(finishList.size() != nodeNum) {
			if(q.isEmpty()) {
				break;
			}
			
			int getNum = q.poll(); 
			
			if(visited[getNum]) {
				continue;
			}
			
			visited[getNum] = true;
			finishList.add(getNum);
			answerBFS += getNum + " ";
			
			for(int i : A[getNum]) {
				if(!visited[i]) q.offer(i);
			}
		}
		return;
	}
	
	static void dfs(int start) {
		if(visited[start]) {
			return;
		}
		
		visited[start] = true;
		answerDFS += start + " ";
		
		for(int i : A[start]) {
			dfs(i);
		}
	}

}
