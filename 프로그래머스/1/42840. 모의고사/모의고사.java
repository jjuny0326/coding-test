import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        List<Integer> person = new ArrayList<>();
        int[] result = new int[3];
        int[] p1 = new int[] {1, 2, 3, 4, 5};
        int[] p2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++){
            if (answers[i] == p1[i % p1.length]) result[0]++;
            if (answers[i] == p2[i % p2.length]) result[1]++;
            if (answers[i] == p3[i % p3.length]) result[2]++;
        }
        int max = result[0];
        for (int i = 1; i < 3; i++){
         if (result[i] > max) max = result[i];
        }
        
        for (int i = 0; i < 3; i++){
            if (result[i] == max){
                person.add(i + 1);
            }
        }
        int[] answer = new int[person.size()];
        for (int i = 0; i < person.size(); i++){
            answer[i] = person.get(i);
        }
        return answer;
    }
}