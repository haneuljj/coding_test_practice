class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int general = hp / 5;
        int soldier = (hp - (general*5)) / 3;
        int normal = (hp - (general*5) - (soldier*3)) / 1;
        
        answer = general + soldier + normal;
        
        return answer;
    }
}