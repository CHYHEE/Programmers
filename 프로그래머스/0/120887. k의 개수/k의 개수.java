class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = String.valueOf(k);
        for(int l=i; l<=j; l++) {
            String value = String.valueOf(l);
            if(value.contains(str)) {
                String[] arr = value.split("");
                for(String a : arr) {
                    if(a.equals(str)) answer++;
                }
            }
        }
        return answer;
    }
}