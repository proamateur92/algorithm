package recursion;

public class recursion1 {
	// 재귀함수 무한루프 안빠지는 조건
	// recursion에 빠지는 조건이 1개 이상일 것
	// recursive case가 base case로 수렴할 것
	public static void main(String[] args) {
		int i = 4;
		func(i);
	}

	public static void func(int n) {
		if(n<=0)
			return;
		else
		  System.out.println("Hello World!");
		  func(n-1);
	}
}
