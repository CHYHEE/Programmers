class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] score_avg = new int[score.length];
        
        for(int i=0; i<answer.length; i++) {
            score_avg[i] = score[i][0] + score[i][1];
        }
        
        for(int i=0; i<answer.length; i++) {
            int idx = 1;
            for(int j=0; j<answer.length; j++) {
                if(score_avg[i] < score_avg[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }
        
        return answer;
    }
}