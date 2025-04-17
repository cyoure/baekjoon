import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = n-1; i > 0; i--) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(2);
    }
}