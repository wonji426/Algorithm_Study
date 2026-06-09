class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int m = n;
        int l = 0;
        int sum = m + l;
        while(sum>=a){
            sum = m + l;
            m  = sum/a * b;
            l =  sum%a;
            answer += m;
        }
        return answer;
    }
}
