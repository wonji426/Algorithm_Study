class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            
            String b1 = Integer.toBinaryString(arr1[i]);
            String b2 = Integer.toBinaryString(arr2[i]);
            
            while(b1.length() < n) b1 = "0" + b1;
            while(b2.length() < n) b2 = "0" + b2;
            
            String[] binary1 = b1.split("");
            String[] binary2 = b2.split("");
            
            for(int j=0; j<n; j++) {
                if(binary1[j].equals("1") || binary2[j].equals("1")) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}
