import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        
        Map<Character, Integer> count = new HashMap<>();
        
        for (char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        int maxNum = 0;
        char answer = 'a';
        // 최댓값 찾기
        for (Map.Entry<Character, Integer> e : count.entrySet()){
            if (e.getValue() > maxNum){
                maxNum = e.getValue();
                answer = e.getKey();
            }
        }
        for (Map.Entry<Character, Integer> e : count.entrySet()){
            if (maxNum == e.getValue() && answer != e.getKey()){
                System.out.println('?');
                return;
            }
        }
        System.out.println(answer);
    }
}