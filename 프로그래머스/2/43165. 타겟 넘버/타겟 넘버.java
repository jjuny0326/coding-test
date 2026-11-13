class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    public void dfs(int[] numbers, int target, int count, int num){
        if (count == numbers.length){
            if (num == target){
                answer++;
            }
            return;
        }
        dfs(numbers, target, count + 1, num + numbers[count]);
        dfs(numbers, target, count + 1, num - numbers[count]);
    }
}