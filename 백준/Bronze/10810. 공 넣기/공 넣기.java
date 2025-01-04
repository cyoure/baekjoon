import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int b = i; b <= j; b++) {
                arr[b-1] = k;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}