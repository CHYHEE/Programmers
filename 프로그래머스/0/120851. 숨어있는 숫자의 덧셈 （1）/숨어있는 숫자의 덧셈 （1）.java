class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] a  = my_string.split("");
        
        for(int i=0; i<a.length; i++) {
            answer += Integer.valueOf(a[i]);
        }
        
        return answer;
    }
}