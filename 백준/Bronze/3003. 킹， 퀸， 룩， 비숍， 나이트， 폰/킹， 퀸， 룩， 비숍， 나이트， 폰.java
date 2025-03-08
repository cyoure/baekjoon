import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrA  = new int[6];
        int[] arrB  = {1, 1, 2, 2, 2, 8};
        int[] arrC = new int[6];
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            arrC[i] = arrB[i] - arrA[i];
        }
        for (int i : arrC) {
            System.out.print(i + " ");
        }
    }
}