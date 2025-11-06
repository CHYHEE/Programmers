class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        
        for(int num : num_list) {
            while(num != 1) {
                if(num%2 == 0) {
                    num /= 2;
                    count++;
                } else if(num%2 == 1) {
                    num = (num-1)/2;
                    count++;
                }
            }
        }
        return count;
    }
}