class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s; i++) {
            sb.append(my_string.charAt(i));
        }
        for (int i = e; i >= s; i--) {
            sb.append(my_string.charAt(i));
        }
        for (int i = e + 1; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        String answer = sb.toString();
        return answer;
    }
}