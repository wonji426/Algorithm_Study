class Solution {
    public int solution(int n) {
        int answer = 0;
        String ternary = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(ternary);
        String decimal = sb.reverse().toString();
        answer = Integer.parseInt(decimal, 3);
        return answer;
    }
}
