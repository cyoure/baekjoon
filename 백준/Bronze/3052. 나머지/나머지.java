import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        boolean check = false;
        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();
            arr[i] = input % 42;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
            if (!check) {
                count++;
            }
        }
        if (count == 0) {
            count = 1;
        }
        System.out.println(count);
    }
}
