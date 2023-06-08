import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 1, count = 1, start_index = 1, end_index = 1;
        
        while(end_index != n) {
            if(sum == n) {
                count++;
                end_index++;
                sum += end_index;
            } else if(sum > n) {
                sum -= start_index;
                start_index++;
            } else if(sum < n) {
                end_index++;
                sum += end_index;
            }
        }
        
        System.out.println(count);
    }
}