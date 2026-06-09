class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch += n;
                if(ch>'Z'){
                    ch -= 26;
                }
            } else if(ch >= 'a' && ch <= 'z'){
                ch += n;
                if(ch>'z'){
                    ch -= 26;
                }
            }
            answer.append(ch);
        }
        return answer.toString();
    }
}
