import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        int[] S = new int[suNo + 1];

        int count = 1;

        st = new StringTokenizer(br.readLine());

        while(count - S.length != 0) {
            // 합 배열 생성
            S[count] = S[count-1] + Integer.parseInt(st.nextToken());
            count++;
        }

        count = 0;

        while(count - quizNo != 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 구간 합 계산
            System.out.println(S[j] - S[i-1]);
            count++;
         }
     }
}