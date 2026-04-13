class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = denom1 * numer2 + numer1 * denom2;
        int denom = denom1 * denom2;
        
        int g = gcd(numer, denom);  // 최대공약수
        
        numer /= g;
        denom /= g;
        
        int[] answer = {numer, denom};
        return answer;
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}