class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] a = {"a", "e", "i", "o", "u"};
        
        for(String v : a) {
            answer = answer.replace(v, "");
        }
        
        return answer;
    }
}