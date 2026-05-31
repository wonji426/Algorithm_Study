import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int len = (int) Math.log10(n) + 1;
        Integer[] number = new Integer[len];

        for(int i=0; i<len; i++){
            number[i] = (int)(n % 10);
            n /= 10;
        }

        Arrays.sort(number, Collections.reverseOrder());

        for (int num : number) {
            answer = answer * 10 + num;
        }

        return answer;
    }
}
