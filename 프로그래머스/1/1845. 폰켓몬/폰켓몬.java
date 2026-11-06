import java.util.*;

class Solution {
    public int solution(int[] nums) {        
        int choice = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){  // 중복제거
            set.add(nums[i]);
        }
        
        if (set.size() > choice){
            return choice;
        }
        return set.size();
    }
}