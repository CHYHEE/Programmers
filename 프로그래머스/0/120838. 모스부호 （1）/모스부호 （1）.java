class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morseList = {
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."};
        
        String[] morse;
        morse = letter.split(" ");
        for(String s : morse) {
            for(int i=0; i<morseList.length; i++) {
                if(s.equals(morseList[i])) {
                    //아스키코드 값을 더해 i가 0이면 0번째 인덱스의 값은 a
                    answer += Character.toString(i + 'a');
                }
            }
        }
        return answer;
    }
}
