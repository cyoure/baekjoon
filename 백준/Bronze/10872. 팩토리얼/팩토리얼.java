import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            sum *= i;
        }
        System.out.println(sum);
    }
}