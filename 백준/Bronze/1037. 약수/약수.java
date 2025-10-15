import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] divisor = new int[count];
        for (int i = 0; i < count; i++) {
            divisor[i] = sc.nextInt();
        }
        Arrays.sort(divisor);
        if (divisor.length == 1) {
            System.out.println(divisor[0] * divisor[0]);
        } else {
            System.out.println(divisor[0] * divisor[count - 1]);
        }
    }
}