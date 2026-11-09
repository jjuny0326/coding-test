import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int s : scoville){
            pq.offer(s);
        }
        if (pq.peek() >= K) return 0;
        
        while(pq.size() > 1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            
            pq.offer(s1 + s2*2);
            count++;
            
            if (pq.peek() >= K) break;
        }
        
        if (pq.peek() < K) return -1;
        return count;
      
    }
}