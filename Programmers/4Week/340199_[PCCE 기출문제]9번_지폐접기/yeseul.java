class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int a = 0;
        int minW = Math.min(wallet[0], wallet[1]);
        int maxW = Math.max(wallet[0], wallet[1]);
        int minB = Math.min(bill[0], bill[1]);
        int maxB = Math.max(bill[0], bill[1]);
        while(a == 0){
            if(minW < minB || maxW < maxB){
                maxB /= 2;
                answer++;
            }
            
            if(minB>maxB){
                int temp = minB;
                minB = maxB;
                maxB = temp;
            }
            
            if(minW >= minB && maxW >= maxB){
                a = 1;
            }
        }
        return answer;
    }
}
