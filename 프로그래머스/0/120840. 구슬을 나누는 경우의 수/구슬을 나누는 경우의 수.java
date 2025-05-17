class Solution {
//     public int solution(int balls, int share) {
//         long n1 = 1;
//         long m1 = 1;
        
//         for(int i=0; i<share; i++) {
//             n1 *= (balls-i);
//         }
        
//         for(int i=1; i<=share; i++){
//             m1 *= i;
//         }
        
//         return (int)(n1/m1);
//     }
    
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
}