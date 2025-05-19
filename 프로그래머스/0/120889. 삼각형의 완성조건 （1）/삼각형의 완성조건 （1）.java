class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        
        for(int i=0; i<sides.length; i++) {
            if(max<sides[i]) {
                max = sides[i];
            }
            
            answer += sides[i];
        }
        answer -= max;
        if(answer<=max) {
            answer = 2;
        } else {
            answer = 1;
        }
        return answer;
    }
}


//-------------------------------------------------------
import java.util.*;

class Solution {
    public int solution(int[] sides) {
        //int answer = 0;
        Arrays.sort(sides);
        
        return sides[2] < sides[1] + sides[0] ? 1 : 2;
    }
}
