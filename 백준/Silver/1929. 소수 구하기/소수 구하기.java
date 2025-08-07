import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n<2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();
        for (int i = startNum; i <= endNum; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}