import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0;
        int count = 0;
        int i = 1;
        while (count != n) {
            if (Integer.toString(i).contains("666")) {
                count++;
                if (count == n) {
                    number = i;
                }
            }
            i++;
        }
        System.out.println(number);
    }
}