class Solution {
    public int solution(int n) {
        int answer = 0;
        int mul=n/7;
        int a=n%7;
        
        if(a<7 && a!=0) {
            mul+=1;
            answer = mul;
        } else if(a==0) {
            answer = mul;
        }
        
        return answer;
    }
}