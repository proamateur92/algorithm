import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] A = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());     
        }
        
        int i = 0;
        int j = 0;
        int sum = 0;
        int result = 0;
               
        while(true) {
             if(sum>=m){
                sum-=A[i++];
            }
            else if(j==n){
                break;
            }else{
                sum+=A[j++];
            }
            if(sum == m) {
                result++;
            }
        }
        
        System.out.println(result);
        br.close();
    }
}