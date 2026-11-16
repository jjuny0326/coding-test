import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = new int[] {-1, 1, 0, 0};
        int[] dy = new int[] {0, 0, -1, 1};
        
        boolean[][] visited = new boolean[n][m];
        
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {0, 0, 1});
        visited[0][0] = true;
        
        while (!queue.isEmpty()){
            int[] now = queue.poll();
            if (now[0] == n - 1 && now[1] == m - 1) return now[2];
            for (int i = 0; i < 4; i++){
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];
                
                if (x < 0 || x >= n || y < 0 || y >= m) continue;
                if (maps[x][y] == 0 || visited[x][y]) continue;
                
                queue.offer(new int[] {x,y, now[2] + 1});
                visited[x][y] = true;
            }
        }
        
        return -1;
    }
}