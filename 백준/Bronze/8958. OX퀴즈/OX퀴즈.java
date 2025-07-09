import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        int score = 0;
        for (int i = 0; i < count; i++) {
            String answer = sc.next();
            for (int j = 0; j < answer.length(); j++) {
                if (answer.charAt(j) == 'O') {
                    score++;
                    sum += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(sum);
            score = 0;
            sum = 0;
        }
    }
}