import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Long[] A = new Long[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());     
        }
        
        Arrays.sort(A);
        
        int result = 0;
        
        for(int k=0; k < N; k++) {
            long find = A[k];
            int i = 0;
            int j = N-1;
            
            while(i < j) {
                if(A[i] + A[j] == find) {
                    if(i != k && j != k) {
                        result++;
                        break;
                    } else if(i == k) {
                        i++;
                    } else if(j == k) {
                        j--;
                    }
                } else if(A[i] + A[j] > find) {
                    j--;
                } else {
                    i++;
                }   
            }
        }
        
        System.out.println(result);
    }
}