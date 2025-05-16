class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++) {
            for(int j=0; j<emergency.length; j++) {
                if(emergency[i]<emergency[j]) {
                    answer[i]++;    //배열에 후위연산자를 사용하면 배열의 해당 인덱스의 값을 증가시킴
                }
            }
            answer[i]++;
        }
        return answer;
    }
}