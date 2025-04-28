import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        if (a <= c && a * n + a1 <= c * n) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}