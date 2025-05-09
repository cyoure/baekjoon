import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] board = new char[N][M];
        
        // 보드 입력
        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        
        int minRepaint = Integer.MAX_VALUE;
        
        // 가능한 모든 8x8 영역 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 두 가지 패턴(왼쪽 위가 'W' 또는 'B') 비교
                int repaint1 = countRepaint(board, i, j, 'W'); // 패턴 1: 왼쪽 위가 W
                int repaint2 = countRepaint(board, i, j, 'B'); // 패턴 2: 왼쪽 위가311 B
                // 두 패턴 중 최소값 선택
                minRepaint = Math.min(minRepaint, Math.min(repaint1, repaint2));
            }
        }
        
        System.out.println(minRepaint);
        sc.close();
    }
    
    // 주어진 시작점(i, j)에서 8x8 영역에 대해 다시 칠해야 하는 칸 수 계산
    private static int countRepaint(char[][] board, int startRow, int startCol, char startColor) {
        int repaintCount = 0;
        char expectedColor;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // 체스판 패턴에 따라 예상 색상 계산
                if ((i + j) % 2 == 0) {
                    expectedColor = startColor; // 시작 색상
                } else {
                    expectedColor = (startColor == 'W') ? 'B' : 'W'; // 반대 색상
                }
                // 현재 칸이 예상 색상과 다르면 다시 칠해야 함
                if (board[startRow + i][startCol + j] != expectedColor) {
                    repaintCount++;
                }
            }
        }
        
        return repaintCount;
    }
}