import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = -1, index2 = -1;
        
        for(String word : goal) {
            // 현재 단어가 cards1에 있는 경우
            if(index1 < cards1.length - 1 && cards1[index1 + 1].equals(word)) {
                index1++;
            }
            // 현재 단어가 cards2에 있는 경우
            else if(index2 < cards2.length - 1 && cards2[index2 + 1].equals(word)) {
                index2++;
            }
            // 현재 단어를 사용할 수 없는 경우
            else {
                return "No";
            }
        }
        
        return "Yes";
    }
}
