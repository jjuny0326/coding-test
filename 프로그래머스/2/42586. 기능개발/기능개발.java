import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> remainTime = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++){
            int remain = 100 - progresses[i];
            int time = remain / speeds[i];
            if (remain > time * speeds[i]){
                remainTime.offer(time + 1);
            }
            else{
                remainTime.offer(time);
            }
        }
        // 7 3 9
        
        while (!remainTime.isEmpty()){
            int time = remainTime.poll();
            int count = 1;
            while (!remainTime.isEmpty() && remainTime.peek() <= time){
                remainTime.poll();
                count++;
            }
            answer.add(count);
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}