import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
//		5 2
//		4 1 2 3 5
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
	
		// 숫자 갯수
		int N = Integer.parseInt(st.nextToken());
		// 찾아야 할 위치
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		
		// 배열 초기화
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		quickSort(A, 0, N-1, K-1);
		System.out.println(A[K -1]);
	}
	
	public static void quickSort(int[] A, int S, int E, int K) {
		// 부분집합 만들기 함수
		if(S < E) {
			// pivot 구하기 함수
			int pivot = partition(A, S, E);
			
			if (pivot == K) {
				return;
			} else if(pivot > K) {
				quickSort(A, 0, pivot - 1, K);
			} else {
				quickSort(A, pivot + 1, E, K);
			}
		}
	}; 
	
	public static int partition(int[] A, int S, int E) {
		if(S + 1 == E) {
			if(A[S] > A[E]) swap(A, S, E);
			return E;
		}
		
		int M = (S + E) / 2;
		
		swap(A, S, M);
		
		int pivot = A[S];
		int i = S + 1, j = E;
		
		while(i <= j) {
			while(pivot < A[j] && j > 0) {
				j--;
			} 
			
			while(pivot > A[i] && i < A.length-1) {
				i++;
			}
			
			if(i <= j) {
				swap(A, i++, j--);
			}
		}
		
		A[S] = A[j];
		A[j] = pivot;
		
		return j;
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
