import java.util.*;

class Solution {
    public int[] solution(int n) {
        int count = 0;
        
        for(int i=1; i<=n; i++) {   //약수의 개수를 구하려고
            if(n%i==0) {
                count++;
            }
        }
        
        int[] answer = new int [count];
        int a=0;
        
        for(int i=1; i<=n; i++) {   // 다시 약수를 구하여 배열에 저장
            if(n%i==0) {
                answer[a]=i;
                a++;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}