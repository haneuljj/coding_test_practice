import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int a, b;
        double answer;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        answer = (double)a / (double)b;

        System.out.println(answer);

        scanner.close();
    }
}