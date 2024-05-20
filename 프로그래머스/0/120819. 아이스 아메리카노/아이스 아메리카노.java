class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int drinks = money / 5500;
        int change = money % 5500;
        
        answer[0] = drinks;
        answer[1] = change;
        
        return answer;
    }
}