import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[1000000];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i < Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) {
                for  (int j = i*i; j < isPrime.length; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int count = 0;
            int evenNum = sc.nextInt();
            for (int j = 0; j <= evenNum / 2; j++) {
                if (isPrime[j] && isPrime[evenNum-j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}