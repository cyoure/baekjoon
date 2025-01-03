import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int maxN = 1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxN = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxN);

    }
}