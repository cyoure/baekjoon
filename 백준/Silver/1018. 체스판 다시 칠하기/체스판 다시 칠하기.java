import java.util.Scanner;

public class Main {
    // 미리 정의된 8x8 체스판 패턴 (왼쪽 위가 W)
    private static final char[][] patternW = {
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
    };

    // 미리 정의된 8x8 체스판 패턴 (왼쪽 위가 B)
    private static final char[][] patternB = {
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] board = new char[N][M];

        // 보드 입력
        for (int i = 0; i < N; i++) {
            board[i] = sc.next().toCharArray();
        }

        int minRepaint = 64; // 최대 64칸 모두 다시 칠하는 경우

        // 가능한 모든 8x8 영역 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int repaintW = 0; // 패턴 W와의 차이
                int repaintB = 0; // 패턴 B와의 차이

                // 8x8 영역 비교
                for (int r = 0; r < 8; r++) {
                    for (int c = 0; c < 8; c++) {
                        if (board[i + r][j + c] != patternW[r][c]) {
                            repaintW++;
                        }
                        if (board[i + r][j + c] != patternB[r][c]) {
                            repaintB++;
                        }
                    }
                }

                // 최소값 갱신
                minRepaint = Math.min(minRepaint, Math.min(repaintW, repaintB));
            }
        }

        System.out.println(minRepaint);
        sc.close();
    }
}