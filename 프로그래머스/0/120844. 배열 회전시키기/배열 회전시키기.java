class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            if(direction.equals("right")) {
                answer[(i+1)%numbers.length] = numbers[i];
            } else {
                answer[i] = numbers[(i+1)%numbers.length];
            }
        }
        return answer;
    }
}