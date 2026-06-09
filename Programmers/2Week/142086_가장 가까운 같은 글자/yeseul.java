class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            String str = s.substring(0,i);
            int index = str.lastIndexOf(ch);
            answer[i] = (index==-1)? index : i-index;
        }
        return answer;
    }
}
