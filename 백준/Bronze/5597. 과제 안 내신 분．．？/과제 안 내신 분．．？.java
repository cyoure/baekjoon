import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];
        for (int i = 0; i < 28; i++) {
            int student = sc.nextInt();
            arr[student] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}