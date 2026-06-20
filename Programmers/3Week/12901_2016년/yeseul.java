class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String[] weekday = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int day = b;
        for(int i = 0; i < a; i++){
            day += months[i];
        }
        answer = weekday[day%7];
        return answer;
    }
}
