import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 1; i <10; i++){
            int target = i;
            if(!Arrays.stream(numbers).anyMatch(x -> x == target)){
                answer += i;
            }
        }
        return answer;
    }
}
