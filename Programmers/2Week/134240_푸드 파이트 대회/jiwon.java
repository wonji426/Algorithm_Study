class Solution {
    public String solution(int[] food) {
        String answer = "";
        int count = 1;
        
        for(int i=1; i<food.length; i++) {
            if(food[i] % 2 == 0) {
                for(int j=0; j<food[i] / 2; j++) {
                     answer += count;
                }
            } else {
                for(int j=0; j<(food[i] - 1) / 2; j++) {
                    answer += count;
                }
            }
            count++;
        }
        
        StringBuilder sb = new StringBuilder(answer);
        answer += "0" + sb.reverse().toString();
        
        return answer;
    }
}
