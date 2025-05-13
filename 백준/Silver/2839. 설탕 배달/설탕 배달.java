import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        int count = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < kg; i++) {
            for (int j = 0; j < kg; j++) {
               if (5 * i + 3 * j == kg) {
                   count = i + j;
                   min = Math.min(min, count);
               }
            }
        }
        System.out.println(count);
    }
}