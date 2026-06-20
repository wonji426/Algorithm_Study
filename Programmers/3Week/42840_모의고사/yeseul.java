import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(arr1[i%arr1.length]==answers[i]){
                count[0]++;
            } 
            if(arr2[i%arr2.length]==answers[i]){
                count[1]++;
            } 
            if(arr3[i%arr3.length]==answers[i]){
                count[2]++;
            }
        }
        
        int max = Math.max(count[0], Math.max(count[1],count[2]));
        if(max==count[0]){
            list.add(1);
        }
        if(max==count[1]){
            list.add(2);
        }
        if(max==count[2]){
            list.add(3);
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
