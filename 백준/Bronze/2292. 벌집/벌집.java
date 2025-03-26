import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1; // 지나가는 방 개수 (최소 1부터 시작)
        long range = 1; // 현재 층의 최대 번호

        while (range < N) {
            range += 6 * count; // 다음 층으로 이동 (6, 12, 18, ...)
            count++;
        }
        System.out.println(count);
    }
}