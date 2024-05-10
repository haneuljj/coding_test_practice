import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int a, b;
        int answer;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        answer = a - b;

        System.out.println(answer);

        scanner.close();
    }
}
