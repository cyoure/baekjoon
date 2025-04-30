import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        int max = arr[0]+arr[1]+arr[2];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (arr[i] + arr[j] + arr[k] >= max && arr[i] + arr[j] + arr[k] <= M) {
                        max = arr[i] + arr[j] + arr[k];
                        sum = arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}