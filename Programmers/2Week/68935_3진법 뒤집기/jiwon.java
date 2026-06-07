class Solution {
    public int solution(int n) {
        
        String ternary = Integer.toString(n, 3);
        
        StringBuilder sb = new StringBuilder(ternary);
        String reverse = sb.reverse().toString();
        
        return Integer.parseInt(reverse,3);
    }
}
