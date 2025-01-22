import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        String a = sc.next();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = a.substring(i, i + 1);
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}