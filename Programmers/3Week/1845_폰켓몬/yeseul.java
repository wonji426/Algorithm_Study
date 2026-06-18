import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length/2;
        Map<Integer, Integer> map = new HashMap();
        for(int num : nums){
            map.put(num ,num);
        }
        answer = (len>map.size())?map.size():len;
        return answer;
    }
}
