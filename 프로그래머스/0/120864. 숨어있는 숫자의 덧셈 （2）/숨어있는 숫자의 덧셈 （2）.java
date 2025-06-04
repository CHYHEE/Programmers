class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(String arr : my_string.split("[a-zA-Z]+")) {
            if(!arr.isEmpty())
                answer += Integer.parseInt(arr);
        }
        return answer;
    }
}