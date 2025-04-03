import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            ArrayList<Integer> numbers = new ArrayList<>();
            int sum = 0;
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    numbers.add(i);
                }
            }
            if (n == sum) {
                System.out.print(n + " = ");
                for (int i = 0; i < numbers.size(); i++) {
                    if (i == numbers.size() - 1) {
                        System.out.println(numbers.get(i));
                    } else {
                        System.out.print(numbers.get(i) + " + ");
                    }
                }
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}