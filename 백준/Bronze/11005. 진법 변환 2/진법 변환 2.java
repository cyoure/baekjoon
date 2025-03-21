import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        String a = Integer.toString(N,B);
        System.out.println(a.toUpperCase());
    }
}
