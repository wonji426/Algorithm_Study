import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        } else {
            int min = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                list.add(num);
            }
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        
        return answer;
    }
}
