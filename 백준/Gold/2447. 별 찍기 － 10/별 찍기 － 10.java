import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static char[][] board; // 별을 담을 2차원 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 N 받기 (3의 거듭제곱)
        int N = Integer.parseInt(br.readLine());

        // 1. 배열 초기화
        board = new char[N][N];

        // 2. 전체 배열을 공백으로 채우기 (나중에 별만 찍기 위해)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = ' ';
            }
        }

        // 3. 재귀 함수 호출 (0, 0 부터 시작, 크기 N)
        star(0, 0, N);
        
        // 4. 결과 출력 (StringBuilder 사용으로 속도 최적화)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(board[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    /**
     * 재귀적으로 별을 찍는 함수
     * @param x : 현재 블록의 행 시작점
     * @param y : 현재 블록의 열 시작점
     * @param n : 현재 블록의 크기
     */
    static void star(int x, int y, int n) {
        // [Base Case] 크기가 1이 되면 별을 찍고 종료
        if (n == 1) {
            board[x][y] = '*';
            return;
        }

        // 현재 크기를 3등분
        int size = n / 3;

        // 3x3 구역을 순회
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 가운데 칸(1, 1)인 경우 별을 찍지 않고 건너뜀 (공백 유지)
                if (i == 1 && j == 1) {
                    continue;
                }

                // 나머지 8개 구역에 대해 재귀 호출
                star(x + (i * size), y + (j * size), size);
            }
        }
    }
}