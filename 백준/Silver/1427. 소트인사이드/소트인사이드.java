import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 500613009
		int num = sc.nextInt();
		String[] sArr = String.valueOf(num).split("");
		
		
		for(int i = 0; i < sArr.length - 1; i++) {
			int max = Integer.parseInt(sArr[i]);
			String temp = "";
			int idx = i;

			for(int j = i + 1; j < sArr.length; j++) {
				
				
				int target = Integer.parseInt(sArr[j]);
				
				if(target > max) {
					max = target;
					idx = j;
				}
			}
			
			temp = sArr[i];
			sArr[i] = String.valueOf(max);
			sArr[idx] = temp;
		}
		
		System.out.println(String.join("", sArr));
	}
}