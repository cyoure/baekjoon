import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        double[] arr = new double[M];
        double sum = 0.0;
        for (int i = 0 ; i < M ; i++) {
            arr[i] = sc.nextInt();
        }
        double max = arr[0];
        for (int i = 0 ; i < M ; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
        }
        for (int i = 0 ; i < M ; i++) {
            arr[i] = arr[i]/max*100;
        }
        for (int i = 0 ; i < M ; i++) {
            sum += arr[i];
        }
        double avg = sum / M;
        System.out.println(avg);
    }
}