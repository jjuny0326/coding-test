import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine().trim());
        
        for (int i = 0; i < T; i++){
            sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int ssize = s.length();
            for (int j = 0; j < ssize; j++){
                for (int k = 0; k < n; k++){
                    sb.append(s.charAt(j));
                }
            }
            
            System.out.println(sb);
        }
        
        
        
    }
}
