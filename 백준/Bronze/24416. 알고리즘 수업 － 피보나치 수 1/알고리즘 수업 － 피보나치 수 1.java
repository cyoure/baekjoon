import java.util.Scanner;

public class Main {
    static int badCount = 0;
    static int goodCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        badFibonacci(number);
        goodFibonacci(number);
        System.out.println(badCount + " " + goodCount);
    }

    private static int badFibonacci(int count) {
        if (count == 1 || count == 2) {
            badCount++;
            return 1;
        }
        else {
           return badFibonacci(count - 1) + badFibonacci(count - 2);
        }
    }

    private static int goodFibonacci(int count) {
        int[] f = new int[count + 1];
        f[1] = f[2] = 1;
        for (int n = 3; n < count + 1; n++) {
            goodCount++;
            f[n] = f[n-1] + f[n-2];
        }
        return f[count];
    }
}