class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        // 타겟 문자 확인
        // 타겟문자가 키에 존재하는 지 확인하고 더 적게 눌러도되는 키로 눌러야함
        for (int i = 0; i < targets.length; i++) {
            int totalPresses = 0;  // 현재 타겟에 대한 총 키 입력 수를 저장
            boolean isPossible = true; // 키맵을 사용하여 타겟을 입력할 수 있는지 확인
            
            for (int j = 0; j < targets[i].length(); j++) {
                // 눌러야할 문자 찾기
                char currentChar = targets[i].charAt(j);

                // 키에서 눌러야할 문자가 어디있는지 저장할 변수 선언
                int currentCharIndex = Integer.MAX_VALUE;
                for (String key : keymap) {
                    int charIndex = key.indexOf(String.valueOf(currentChar));
                    // 각 번호의 키를 돌면서 그 문자의 위치가 더 앞에 있다면 그것으로 교체

                    if (charIndex != -1) {
                        currentCharIndex = Math.min(currentCharIndex, charIndex + 1);
                    }
                }

                // 타겟 문자를 키맵으로 누를 수 있는지 확인
                if (currentCharIndex == Integer.MAX_VALUE) {
                    isPossible = false;
                    break;
                } else
                    totalPresses += currentCharIndex;

            }
            if(isPossible)
                answer[i] = totalPresses;
            else
                answer[i] = -1;
        }

        return answer;
    }
}