class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String baby : babbling){
            if(baby.contains("ayaaya")||baby.contains("yeye")||baby.contains("woowoo")||baby.contains("mama")){
                continue;
            }
            
            baby = baby.replace("aya"," ");
            baby = baby.replace("ye"," ");
            baby = baby.replace("woo"," ");
            baby = baby.replace("ma"," ");
            baby = baby.replace(" ","");
            
            if(baby.length() == 0){
                answer++;
            }
        }
        return answer;
    }
}
