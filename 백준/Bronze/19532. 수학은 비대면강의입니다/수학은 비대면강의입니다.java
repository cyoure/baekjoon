import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int x = 0;
        int y = 0;
        if (b * d - e * a != 0) {
            y = (c * d - f * a) / (b * d - e * a);
        } else if (e * a - b * d != 0) {
            y = (f * a - c * d) / (e * a - b * d);
        }
        if (a != 0) {
            x = (c - (b * y)) / a;
        } else {
            x = (f - (e * y)) / d;
        }
        System.out.println(x + " " + y);
    }
}