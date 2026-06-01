class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += Integer.parseInt(arr[i]);
        }
        answer = x%sum==0 ? true : false;
        
        return answer;
    }
}
