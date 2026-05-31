class Solution {
    public int[] solution(long n) {
        String tmp = String.valueOf(n);
        int[] answer = new int[tmp.length()];
        int num = 0;

        while(n > 0) {
            answer[num] = (int)(n % 10);
            n /= 10;
            num++;
        }

        return answer;
    }
}
