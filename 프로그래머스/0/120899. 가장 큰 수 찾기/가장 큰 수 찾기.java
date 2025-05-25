class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int[] answer = {max,0};
        
        for(int i=0; i<array.length; i++) {
            if(max<array[i]) {
                max = array[i];
                answer[0] = max;
                answer[1] = i;
            }
        }
        return answer;
    }
}