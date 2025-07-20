import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++) {
            int endIndex = s+l;
            int strValue = Integer.parseInt(intStrs[i].substring(s, endIndex));
            
            if( k < strValue ){
                answer.add(strValue);
            }
        }
        return answer;
    }
}