class Solution {
    public int solution(int[] numbers, int k) {
        // 한 명은 건너뛰고 인덱스는 0부터 시작하니까 -1
        return numbers[2*(k-1)%numbers.length];
    }
}