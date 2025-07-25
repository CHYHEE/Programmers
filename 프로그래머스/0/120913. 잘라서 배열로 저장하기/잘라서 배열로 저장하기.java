class Solution {
    public String[] solution(String my_str, int n) {
        int result = (my_str.length() + n - 1) / n;
        String[] answer = new String[result];

        for(int i=0; i<result; i++) {
            int start = n*i;
            int end = start+n >= my_str.length() ?
                my_str.length() : start+n;
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}