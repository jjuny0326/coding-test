import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] c : commands){
            int s = c[0], e = c[1], d = c[2];
            int[] arr = Arrays.copyOfRange(array, s - 1, e);
            Arrays.sort(arr);
            answer[idx] = arr[d-1];
            idx++;
        }
        return answer;
    }
}