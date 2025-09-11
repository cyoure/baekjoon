import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            int max = 0;
            int smaller1 = 0;
            int smaller2 = 0;
            if (a >= b) {
                max = a;
                smaller1 = b;
                if (max <= c) {
                    max = c;
                    smaller2 = a;
                } else {
                    smaller2 = c;
                }
            } else {
                max = b;
                smaller1 = a;
                if (max <= c) {
                    max = c;
                    smaller2 = b;
                } else {
                    smaller2 = c;
                }
            }
            if (smaller1 * smaller1 + smaller2 * smaller2 == max * max) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}