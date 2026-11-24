import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[][] narr = new int[N][2];

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            narr[i][0] = Integer.parseInt(st.nextToken());
            narr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(narr, (x, y)->{
            if (x[0] == y[0]){
                return x[1] - y[1];
            }
            return x[0] - y[0];
        });

        for (int i = 0; i < N; i++){
            System.out.println(narr[i][0] + " " + narr[i][1]);
        }


    }
}