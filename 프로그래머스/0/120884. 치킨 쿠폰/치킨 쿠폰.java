class Solution {
    public int solution(int chicken) {
        int count = 0;
        
        while(chicken >= 10) {
            int coupon = chicken % 10;
            count += chicken / 10;
            chicken = coupon + chicken / 10;
        }
        return count;
        
    }
}