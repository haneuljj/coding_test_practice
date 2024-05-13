class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        // name에 있는 이름이 photo에 있는지 확인하고, photo에 있다면 해당하는 점수 더하기
        for (int i = 0; i < photo.length; ++i) {
            for (int j = 0; j < photo[i].length; ++j) {
                for (int k = 0; k < name.length; ++k) {
                    if (photo[i][j].equals(name[k])) {
                        answer[i] += yearning[k];
                    }
                }
            }
             // System.out.println(answer[i]);
        }
        
        return answer;
    }
}