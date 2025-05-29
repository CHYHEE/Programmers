class Solution {
    public String[] solution(String[] quiz) {
        String[] a = new String [quiz.length];
        
        for(int i=0; i<quiz.length; i++) {
            String[] answer = quiz[i].split(" ");
            int left = Integer.parseInt(answer[0]);
            int right = Integer.parseInt(answer[2]);
            int result = Integer.parseInt(answer[4]);
            
            if(answer[1].equals("+")) {
                a[i] = (left + right == result) ? "O" : "X";
            } else {
                a[i] = (left - right == result) ? "O" : "X";
            }
        }
        return a;
    }
}