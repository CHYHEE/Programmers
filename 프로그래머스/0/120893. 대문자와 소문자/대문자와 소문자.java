class Solution {
    public String solution(String my_string) {
        String answer = "";
        char temp;
        
        for(int i=0; i<my_string.length(); i++) {
            temp = my_string.charAt(i);
            
            if(Character.isUpperCase(temp)) {
                answer += Character.toLowerCase(temp);
            } else {
                answer += Character.toUpperCase(temp);
            }
        }
        
        return answer;
    }
}