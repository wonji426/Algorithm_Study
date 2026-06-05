import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(arr[0]);
        for(int a : arr){
            if(deque.peekLast()!=a){
                deque.addLast(a);
            }
        }
        int[] answer = new int[deque.size()];
        int i = 0;
        for(int num : deque){
            answer[i++] = num;
        }

        return answer;
    }
}
