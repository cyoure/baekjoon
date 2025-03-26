import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int startPoint = 0;
        if (N == 1) {
            startPoint = 1;
        } else if (2 <= N && N <= 7) {
            startPoint = 2;
        } else {
            int start = 2;
            int end = 7;
            for (int i = 1; ; i++) {
                if (start + (6 * i) <= N && end + (6 * (i + 1)) >= N) {
                    startPoint = i + 2;
                    break;
                }
                start += 6 * i;
                end += 6 * (i + 1);
                if (end > 1000000000) {
                    startPoint = i+2;
                    break;
                }
            }
        }
        System.out.println(startPoint);
    }
}
