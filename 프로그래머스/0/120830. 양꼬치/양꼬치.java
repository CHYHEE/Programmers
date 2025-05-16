class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int drink = k*2000;
        int food = n*12000;
        int s = n/10;
        
        if(s > 0) {
            s *= 2000;
        }
        
        answer = drink+food-s;
         
        
        return answer;
    }
}