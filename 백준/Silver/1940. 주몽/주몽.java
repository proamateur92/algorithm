import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        int[] A = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());    
        }
        
        Arrays.sort(A);

        int count = 0, i = 0, j = n -1;
        
        while(i < j) {
            if(m == A[i] + A[j]) {
                count++;
                i++;
                j--;
            } else if(m < A[i] + A[j]) {
                j--;
            } else if(m > A[i] + A[j]) {
                i++;
            }
        }
        
        System.out.println(count);
        br.close();
    }
}