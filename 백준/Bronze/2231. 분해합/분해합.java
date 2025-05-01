import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 0;
        for (int i = 1; i < N; i++) {
            int sum = i;
            int j = i;
            while(j > 0) {
                sum += j % 10;
                j /= 10;
            }
            if (sum == N) {
                M = i;
                break;
            }
        }
        System.out.println(M);
    }
}