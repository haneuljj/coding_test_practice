import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // 선택할 수 있는 폰켓몬 수
        int maxSelect = nums.length / 2;

        // 포켓몬 종류를 저장할 Set
        HashSet<Integer> uniquePhonekemon = new HashSet<>();

        // Set을 사용하여 포켓몬 종류의 중복 제거
        for (int num : nums) {
            uniquePhonekemon.add(num);
        }

        // 포켓몬 종류가 선택할 수 있는 폰켓몬 수보다 많으면 선택할 수 있는 폰켓몬 수가 최대
        // 포켓몬 종류가 선택할 수 있는 폰켓몬 수보다 적으면 포켓몬 종류 수가 최대
        return Math.min(uniquePhonekemon.size(), maxSelect);
    }
}
