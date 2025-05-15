class Solution {
    public int solution(int n) {
        int answer = 0;
        int num=0;
        
        for(int i=1; i<=n*6; i++) {
            if(i*6%n==0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
