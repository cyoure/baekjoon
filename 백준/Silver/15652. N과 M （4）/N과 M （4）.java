import java.util.Scanner;

public class Main {

    private static int N, M;

    private static int[] selected;

    private static StringBuilder sb = new StringBuilder();

    private static boolean[] small;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        selected = new int[M];

        small = new boolean[N];

        findSequences(1,0);

        System.out.print(sb.toString());

        sc.close();
    }

    private static void findSequences(int start, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            selected[depth] = i;

            findSequences(i,depth + 1);
        }
    }
}