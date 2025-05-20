class Solution {
    public int solution(int order) {
        String o = order+"";
        String[] answer = o.split("");
        //int[] answer = new int[order];
        int count = 0;
        
        for(int i=0; i<answer.length; i++) {
            if(answer[i].equals("3")) {
                count++;
            } else if(answer[i].equals("6")) {
                count++;
            } else if(answer[i].equals("9")) {
                count++;
            }
        }
        
        return count;
    }
}