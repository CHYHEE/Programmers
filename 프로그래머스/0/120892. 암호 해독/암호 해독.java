class Solution {
    public String solution(String cipher, int code) {
        String[] answer = cipher.split("");
        String a = "";
        
        for(int i=0; i<answer.length; i++) {
            if((i+1)%code==0) {
                a += answer[i];
            }
        }
        return a;
    }
}