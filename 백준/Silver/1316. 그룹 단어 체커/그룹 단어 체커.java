import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        n = sc.nextInt();
        sc.nextLine(); // !!! 입력 버퍼 비우기 !!!

        if (n > 0 && n < 101) {
            for (int i = 0; i < n; i++) {
                String myWord = sc.nextLine().trim();

                if (isGroupWord(myWord)) {
                    answer++;
                }
            }

            System.out.println(answer);
            sc.close();
        }
    }

    /* 그룹단어인지 확인하는 함수 */
    public static boolean isGroupWord(String word) {
        // 알파벳 26글자의 등장을 추적하기 위해 불린 배열 선언 
        boolean[] alpha = new boolean[26];

        char prevChar = '\0'; // 이전 문자를 추적하는 변수

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // 현재 문자가 이전 문자와 다를 경우 그룹단어인지 체크
            if (currentChar != prevChar) {

                // 현재문자가 true, 즉 이전에 등장한 적 있다면 그룹 단어가 아님
                if (alpha[currentChar - 'a']) {
                    return false;
                }

                // 이전에 등장한적 없다면 true로 바꾸고, 이전문자를 현재문자로 바꾸기
                alpha[currentChar - 'a'] = true;
                prevChar = currentChar;
            }
        }
        return true;
    }
}
