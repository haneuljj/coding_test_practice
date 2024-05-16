class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int sheepPrice = 12000 * n;
        int drinkPrice = 2000 * (k - (n/10));
        
        answer = sheepPrice + drinkPrice;
        
        return answer;
    }
}