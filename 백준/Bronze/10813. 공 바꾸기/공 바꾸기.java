import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = i+1;
        }
        for (int a = 0; a < N; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int exchange = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = exchange;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
