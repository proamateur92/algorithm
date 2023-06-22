import java.util.Scanner;

public class Main{
    static int n;
    
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
        n = sc.nextInt();
		
		dfs(2, 1);
		dfs(3, 1);
		dfs(5, 1);
		dfs(7, 1);
	}
	
	static void dfs(int targetN, int digit) {
		if(digit == n) {
			if(isPrime(targetN)) System.out.println(targetN);
			return;
		}
		
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 0) continue;
			
			int newNumber = targetN * 10 + i;
			
			if(isPrime(newNumber)) {
				dfs(newNumber, digit + 1);
			}
		}
	}
	
	static boolean isPrime(int number) {
		for(int i = 2; i <= number / 2; i++) {
			if(number % i == 0) return false;
		}
		
		return true;
	}
}
