import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> pname = new HashMap<>();
        
        for (String c : completion){
            pname.put(c, pname.getOrDefault(c, 0) + 1);
        }
        for (String p : participant){
            int count = pname.getOrDefault(p, 0);
            if (count == 0){
                return p;
            }
            else{
                pname.put(p, count - 1);
            }
        }
        return "";
    }
    
}