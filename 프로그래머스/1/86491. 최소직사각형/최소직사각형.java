class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxNum = 0;
        int minMaxNum = 0;
        for (int[] size : sizes){
            maxNum = Math.max(size[0], size[1]) > maxNum ? Math.max(size[0], size[1]) : maxNum;
            minMaxNum = Math.min(size[0], size[1]) > minMaxNum ? Math.min(size[0], size[1]) : minMaxNum;
            
        }
        
        
        return maxNum * minMaxNum;
    }
}