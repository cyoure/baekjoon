import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bread = sc.nextInt();
        int petty = sc.nextInt();
        int count = 0;
        while (bread > 1 && petty > 0) {
            bread -= 2;
            petty -= 1;
            count++;
        }
        System.out.println(count);
    }
}