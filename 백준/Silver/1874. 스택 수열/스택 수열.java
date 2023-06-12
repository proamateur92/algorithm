import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		Stack<Integer> stk = new Stack<Integer>();
		int stackNumber = 0;
		
		while(count>0) {
			int number = Integer.parseInt(br.readLine());
			Boolean check = true;

			if(number > stackNumber) {
				while(number > stackNumber) {
					stackNumber++;
					stk.push(stackNumber);
					sb.append("+").append("\n");
				}
				stk.pop();
				sb.append("-").append("\n");
			} else {
				if(!stk.empty()) {
					int x = stk.peek();
					stk.pop();
					sb.append("-").append("\n");
					if(x!=number) {
						check = false;
					}
				}
			}
			
			if(!check) {
				System.out.println("NO");
				return;
			}
			count--;
		}
		System.out.println(sb);
	}
}
