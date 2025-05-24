import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] arr = new int[count][2];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i][0] + " " + arr[i][1] + "\n");
        }
    }
}

