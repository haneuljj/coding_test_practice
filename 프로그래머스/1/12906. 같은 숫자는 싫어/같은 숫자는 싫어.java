import java.util.List;
import java.util.ArrayList;
        
public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>(); // 답을 담을 리스트 
        numList.add(arr[0]); // 배열의 첫번째 값 넣기

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // 현재 값이 이전값과 같지 않을 경우에만
                numList.add(arr[i]); // 답 리스트에 추가
            }
        }

        // 답 리스트를 배열로
        int[] result = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            result[i] = numList.get(i);
        }

        return result;
    }
}