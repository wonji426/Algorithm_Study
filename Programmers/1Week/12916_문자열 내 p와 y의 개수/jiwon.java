class Solution {
    boolean solution(String s) {
        String LowerStr = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        
        for(int i=0; i<LowerStr.length(); i++){
            char c = LowerStr.charAt(i);
            
            if(c == 'p') pCount++;
            else if(c == 'y') yCount++;
        }
        
        return pCount == yCount ? true : false;
    }
}
