import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());
        String[][] answer = new String[N][2];

        // 입력
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            answer[i][0] = st.nextToken();
            answer[i][1] = st.nextToken();
        }
        // 정렬
        Arrays.sort(answer, (x,y)->{
            int a = Integer.parseInt(x[0]);
            int b = Integer.parseInt(y[0]);
            return Integer.compare(a,b);
        });

        for (int i = 0; i < N; i++){
            sb.append(answer[i][0]).append(" ").append(answer[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}