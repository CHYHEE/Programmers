class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int i=0; i<numbers.length; i++) {
            if(n >= answer) {
                answer += numbers[i];
            }
        }
        return answer;
    }
}