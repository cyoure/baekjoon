import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int factor = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                factor = i;
                K--;
                if (K == 0) {
                    break;
                } else if (K != 0 && i == N) {
                    factor = 0;
                    break;
                }
            }
        }
        System.out.println(factor);
    }
}