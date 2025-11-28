import java.util.Scanner;

public class Main {
    static int num = 0;
    static StringBuilder sb = new StringBuilder();
    static int number = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        hanoi(num, 1, 2, 3);
        System.out.println(number);
        System.out.println(sb);
    }
    public static void hanoi(int n, int start, int middle, int end) {
        if (n > 0) {
            hanoi(n - 1, start, end, middle);
            sb.append(start + " ");
            sb.append(end + "\n");
            number++;
            hanoi(n - 1, middle, start, end);
        }
    }
}