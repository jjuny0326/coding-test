import java.util.*;
class Solution {
    boolean solution(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++){
            if (ch[i] == '('){
                stack.push(ch[i]);
            }
            else{
                if (stack.isEmpty() || stack.peek() == ')'){
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}