import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] tester1 = {1, 2, 3, 4, 5};
        int[] tester2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] tester3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0, score2 = 0, score3 = 0;
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == tester1[i % tester1.length]) {
                score1++;
            }
            if(answers[i] == tester2[i % tester2.length]) {
                score2++;
            }
            if(answers[i] == tester3[i % tester3.length]) {
                score3++;
            }
        }
        
        int maxScore = score2 >= score3?score2:score3;
        maxScore = score1 >= maxScore?score1:maxScore;
        
        List<Integer> list = new ArrayList<>();
        if (maxScore == score1){
            list.add(1);
        }
        if (maxScore == score2) {
            list.add(2);
        }
        if (maxScore == score3) {
            list.add(3);
        }
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
