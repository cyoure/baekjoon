import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 4) {
            System.out.println("int");
        } else {
            for (int i = 4; i <= N; i = i +4) {
                System.out.print("long ");
            }
            System.out.println("int");
        }
    }
}
