class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        if(len==1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[len-1];
        int min = arr[0];
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=min){
                answer[x] = arr[i];
                x++;
            }
        }
        return answer;
    }
}
