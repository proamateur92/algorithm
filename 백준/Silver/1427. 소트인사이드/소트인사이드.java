import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 500613009
		String str = sc.next();
        final int LENGTH = str.length();
        int[] nArr = new int[LENGTH];
		
        for(int i = 0; i < LENGTH; i++) {
            nArr[i] = Integer.parseInt(str.substring(i, i+1));
        }
        
		for(int i = 0; i < LENGTH - 1; i++) {
			int max = nArr[i];
			int temp = -1;
			int idx = i;

			for(int j = i + 1; j < LENGTH; j++) {			
				int target = nArr[j];
				
				if(target > max) {
					max = target;
					idx = j;
				}
			}
			
			temp = nArr[i];
			nArr[i] = max;
			nArr[idx] = temp;
		}
		
        for(int i = 0; i < LENGTH; i++) {
            System.out.print(nArr[i]);
        }
	}
}