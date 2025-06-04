class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(String arr : my_string.split("[a-zA-Z]+")) {    //영문자가 연속된 부분을 기준으로 분리(빈 문자열도 포함됨)
            if(!arr.isEmpty())
                answer += Integer.parseInt(arr);
        }
        return answer;
    }
}
