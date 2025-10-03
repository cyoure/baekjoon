import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nSum = 1;
        int nMinusK = 1;
        int kSum = 1;
        for (int i = n; i > 0; i--) {
            nSum *= i;
        }
        for (int i = n - k; i > 0; i--) {
            nMinusK *= i;
        }
        for (int i = k; i > 0; i--) {
            kSum *= i;
        }
        System.out.println(nSum / (nMinusK * kSum));
    }
}