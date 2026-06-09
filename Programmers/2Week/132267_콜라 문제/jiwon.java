class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            int count = 0;
            int temp = 0;
            count = n / a;
            temp = n % a;
            n = count * b + temp;
            answer += count * b;
        }
        
        return answer;
    }
}
