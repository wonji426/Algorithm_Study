import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int len = (int) Math.log10(n) + 1;
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = (int)(n % 10);
            n = n / 10;
        }
          
        Arrays.sort(arr);
        
        for(int i=len-1; i>=0; i--){
            answer = answer * 10 + arr[i];
        } 
        
        return answer;
    }
}
