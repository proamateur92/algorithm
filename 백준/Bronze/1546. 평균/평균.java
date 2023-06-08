import java.util.Scanner;

public class Main {
	    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =  sc.nextInt();
		int[] scoreList = new int[n];

		for(int i = 0; i < n; i++) {
			scoreList[i] = sc.nextInt();
		}
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int score : scoreList) {
			sum += score;
			max = score > max ? score : max;  
		}

		System.out.println(sum * 100.0 / max / n);
	}
	
}