import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] sudokuArr = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                sudokuArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0);
    }

    private static boolean solve(int row, int col) {
        if (col == 9) {
            return solve(row + 1, 0);
        }

        if  (row == 9) {
            print();
            return true;
        }

        if  (sudokuArr[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isOkay(row, col, i)) {
                    sudokuArr[row][col] = i;
                    if (solve(row, col + 1)) {
                        return true;
                    }
                    sudokuArr[row][col] = 0;
                }
            }
            return false;
         } else {
            return solve(row, col+1);
        }
    }

    private static void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(sudokuArr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static boolean isOkay(int row, int col, int i) {
        for  (int j = 0; j < 9; j++) {
            if (sudokuArr[row][j] == i) {
                return false;
            }
        }
        for   (int j = 0; j < 9; j++) {
            if (sudokuArr[j][col] == i) {
                return false;
            }
        }
        int startRow = row/3 * 3;
        int startCol = col/3 * 3;
        for (int j = startRow; j <= startRow + 2; j++) {
            for (int k =  startCol; k <= startCol + 2; k++) {
                if (sudokuArr[j][k] == i) {
                    return false;
                }
            }
        }
        return true;
    }
}
