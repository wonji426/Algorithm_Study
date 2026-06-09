class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(Character.isDigit(c)) {
                answer.append(c);
            } else {
                word.append(c);
                String num = changeToNumber(word.toString());
                
                if(num != null) {
                    answer.append(num);
                    word.setLength(0);
                }
            }
        }
        
        return Integer.parseInt(answer.toString());
    }
    
    private String changeToNumber(String word) {
        switch (word) {
            case "zero": return "0";
            case "one": return "1";
            case "two": return "2";
            case "three": return "3";
            case "four": return "4";
            case "five": return "5";
            case "six": return "6";
            case "seven": return "7";
            case "eight": return "8";
            case "nine": return "9";
            default: return null;
        }
    }
}
