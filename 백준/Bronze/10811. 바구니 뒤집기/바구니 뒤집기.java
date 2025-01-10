import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int rememberNum;
        int M = sc.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            i--;
            j--;
            if (j - i == 1 || j - i == 0) {
                for (int b = j, c = i; b > i; b--, c++) {
                    rememberNum = arr[c];
                    arr[c] = arr[b];
                    arr[b] = rememberNum;
                }
            } else {
                for (int b = j, c = i; b > c; b--, c++) {
                    rememberNum = arr[c];
                    arr[c] = arr[b];
                    arr[b] = rememberNum;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}