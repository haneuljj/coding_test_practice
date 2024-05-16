import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // 같은 눈이 3개
        if (a == b && b == c)
            answer = 10000 + a * 1000;
        
        // 같은 눈이 2개
        if ((a == b && b != c)|| (a != b && a == c))
            answer = 1000 + a * 100;
        if (a != b && b == c)
            answer = 1000 + b * 100;

        // 모두 다른 경우
        if (a != b && a != c && b != c) {
            if (a > b && a > c)
                answer = a * 100;
            if (b > a && b > c)
                answer = b * 100;
            if (c > a && c > b)
                answer = c * 100;
        }

        System.out.println(answer);

        sc.close();
    }
}