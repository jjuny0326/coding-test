class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int bw = 0;
        int bh = 0;
        
        for (int[] size : sizes){
            int w = size[0];
            int h = size[1];
            if (w > bw) bw = w;
            if (h > bh) bh = h;
        }
        int b1 = 0;
        int b2 = 0;
        if (bw > bh){   // 최대 길이가 가로에 있을 때
            b1 = bw;
            for (int[] size : sizes){
                int w = size[0];
                int h = size[1];
                
                if (h > w){
                    int temp = h;
                    h = w;
                    w = temp;
                }
                
                if (h > b2){
                    b2 = h;
                }
            }
        }
        else{
            b1 = bh;
            for (int[] size : sizes){
                int w = size[0];
                int h = size[1];
                
                if (w > h){
                    int temp = h;
                    h = w;
                    w = temp;
                }
                
                if (w > b2){
                    b2 = w;
                }
            }
        }
        return b1 * b2;
    }
}