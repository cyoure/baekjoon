import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if ( H==0 && M - 45 < 0) {
            System.out.println(23 + " " + (60 + M - 45));
        } else if (M - 45 < 0) {
            System.out.println(H-1 + " " + (60 + M - 45));
        } else {
            System.out.println(H + " " +  (M - 45));
        }
    }
}
