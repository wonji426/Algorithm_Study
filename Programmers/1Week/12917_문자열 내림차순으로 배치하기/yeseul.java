import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = String.valueOf(s).split("");
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for(String a : arr){
            sb.append(a);
        }
        answer = sb.reverse().toString();
        
        return answer;
    }
}
