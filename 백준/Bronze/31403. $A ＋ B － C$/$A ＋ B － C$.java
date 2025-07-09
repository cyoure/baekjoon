import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(A+B-C);
        String strA = Integer.toString(A);
        String strB = Integer.toString(B);
        System.out.println(Integer.parseInt(strA+strB)-C);
    }
}