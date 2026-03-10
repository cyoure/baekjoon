import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int n;
    static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], 0);
        }
        nQueen(0);
        System.out.println(count);
    }

    private static void nQueen(int depth) {
        if (depth == n) {
            count++;
        }

        for (int i = 0; i < n; i++) {
            if (isOkay(depth, i)) {
                arr[depth][i] = 1;
                nQueen(depth + 1);
                arr[depth][i] = 0;
            }
        }
    }

    private static boolean isOkay(int depth, int i) {
        for  (int j = 0; j < depth; j++) {
            if (arr[j][i] == 1) {
                return false;
        }
    }
        int row = depth -1;
        int col = i - 1;
        while (row >= 0 && col >= 0) {
            if (arr[row][col] == 1) {
                return false;
            }
            row--;
            col--;
        }

        row = depth -1;
        col = i + 1;
        while (row >= 0 && col < n) {
            if (arr[row][col] == 1) {
                return false;
            }
            row--;
            col++;
        }
        return true;
        }
}
