import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String[] inputNums = sc.nextLine().split(" ");
		
		int[] A = new int[n];
		int[] S = new int[n];
		
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(inputNums[i]);
		}
		
		for(int i = 1; i < n; i++) {
			int insert_value = A[i];
			int insert_point = i;
			
			for(int j = i - 1; j >= 0; j--) {
				if(A[i] > A[j]) {
					insert_point = j + 1;
					break;
				}
				
				if(j == 0) {
					insert_point = 0;
				}
			}
			
			for(int j = i; j > insert_point; j--) {
				A[j] = A[j-1];
			}
			
			A[insert_point] = insert_value;
		}
		
		S[0] = A[0];
		
		for(int i = 1; i < n; i++) {
			S[i] = S[i-1] + A[i];
		}
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += S[i];
		}
		
		System.out.println(sum);
	}
}