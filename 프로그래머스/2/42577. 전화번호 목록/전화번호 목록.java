import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < phone_book.length; i++){
            set.add(phone_book[i]);
        }
        for (int i = 0; i < phone_book.length; i++){
            String s = phone_book[i];
            int len = s.length();
            
            for (int j = 1; j < len; j++){
                if (set.contains(s.substring(0, j)))
                    return false;
            }
        }
        
        return true;
    }
}