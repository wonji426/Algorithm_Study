class Solution {
    public String solution(int a, int b) {
        int[] Month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] Week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int days = 0;
        for (int i = 0; i < a - 1; i++) {
            days += Month[i];
        }
        days += (b - 1);
        
        return Week[days % 7];
    }
}
