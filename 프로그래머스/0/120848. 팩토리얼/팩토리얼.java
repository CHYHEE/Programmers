class Solution {
    public int solution(int n) {
        int answer = 0;
        int f = 1;
        int k = 1;
        
        while(true) {
            f *= k;
            if(f>n) {
                answer = k;
                break;
            }
            k++;
        }
        
        return answer-1;
    }
}