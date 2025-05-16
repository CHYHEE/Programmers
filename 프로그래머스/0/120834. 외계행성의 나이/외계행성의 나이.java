class Solution {
    public String solution(int age) {
        String answer = "";
        String age2 = "abcdefghij";
        String[] arr = String.valueOf(age).split("");
        
        for(int i=0; i<arr.length; i++) {
            answer += age2.charAt(Integer.valueOf(arr[i]));
        }
        
        return answer;
    }
}