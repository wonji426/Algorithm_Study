class Solution {
    public int solution(String t, String p) {
        int t_len = t.length();
        int p_len = p.length();
        long num = Long.parseLong(p);
        int answer = 0;
        for(int i = 0; i <= t_len-p_len; i++){
            long compare = Long.parseLong(t.substring(i,i+p_len));
            if(num >= compare){
                answer++;
            }
        }
        return answer;
    }
}
