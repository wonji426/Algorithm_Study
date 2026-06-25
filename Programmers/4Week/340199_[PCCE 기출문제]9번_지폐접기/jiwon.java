class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int wMin = Math.min(wallet[0], wallet[1]);
        int wMax = Math.max(wallet[0], wallet[1]);
        
        int bMin = Math.min(bill[0], bill[1]);
        int bMax = Math.max(bill[0], bill[1]);
         
        while (bMin > wMin || bMax > wMax) {
            int folded = bMax / 2;
            
            bMax = Math.max(folded, bMin);
            bMin = Math.min(folded, bMin);
            
            answer++;
        }
        
        return answer;
    }
}
