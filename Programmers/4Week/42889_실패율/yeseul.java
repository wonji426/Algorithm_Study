import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stage = new int[N+2];
        for(int s : stages){
            stage[s]++;
        }
        
        List<Stage> list = new ArrayList<>();
        int total = stages.length;
        for(int i = 1; i <= N; i++){
            if(stage[i]==0){
                list.add(new Stage(i, 0));
            } else {
                double rate = (double)stage[i] / total;
                total -= stage[i];
                list.add(new Stage(i, rate));
            }
            
        }
        
        list.sort((stage1, stage2) -> {
            if(stage1.failRate == stage2.failRate){
                return Integer.compare(stage1.stageNum, stage2.stageNum);
            }
            return Double.compare(stage2.failRate, stage1.failRate);
        });
        
        for(int i = 0; i < N; i++){
            answer[i] = list.get(i).stageNum;
        }
        return answer;
    }
    
    class Stage {
        int stageNum;
        double failRate;
        
        public Stage(int stageNum, double failRate){
            this.stageNum = stageNum;
            this.failRate = failRate;
        }
    }
}
