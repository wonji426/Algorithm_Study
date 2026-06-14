class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            String a1 = String.format("%"+n+"s", Integer.toBinaryString(arr1[i])).replace(' ','0');
            String a2 = String.format("%"+n+"s", Integer.toBinaryString(arr2[i])).replace(' ','0');
            String[] ar1 = a1.split("");
            String[] ar2 = a2.split("");
            
            String result = "";
            for(int j = 0; j < n; j++){
                if("0".equals(ar1[j])&&"0".equals(ar2[j])){
                    result += " ";
                } else{
                    result += "#";
                }
                answer[i] = result;
            }
        }
        return answer;
    }
}
