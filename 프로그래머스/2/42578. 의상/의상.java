import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> type = new HashMap<>();
        
        for (String[] cloth : clothes){
            type.put(cloth[1], type.getOrDefault(cloth[1], 0) + 1);
        }
        for (Map.Entry<String, Integer> e:type.entrySet()){
            answer *= (e.getValue() + 1);
        }
        return answer - 1;
    }
}