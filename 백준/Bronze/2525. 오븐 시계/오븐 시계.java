import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int plus = (B + C) / 60;

        if (plus > 0) {
           if (A + plus < 24) {
               System.out.println(A + plus + " " + (B + C) % 60);
           } else {
               System.out.println(A + plus - 24 + " " + (B + C) % 60);
           }
        } else {
            System.out.println(A + " " + (B + C));
        }
    }
}