import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N 입력
        int N = Integer.parseInt(br.readLine().trim());

        // 중복 제거
        Set<String> setString = new HashSet<>();
        for (int i = 0; i < N; i++){
            setString.add(br.readLine());
        }

        List<String> list = new ArrayList<>(setString);
        list.sort((x,y)->
            x.length() == y.length() ? x.compareTo(y) : x.length() - y.length()
        );
        for (int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}