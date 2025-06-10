class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for(String word : babbling) {
            for(String a : arr) {
                if(word.contains(a)) {
                    word = word.replace(a, " ");
                }
            }
            word = word.replace(" ", "");
            if(word.equals("")) answer++;
        }
        
        return answer;
    }
}