import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] xLocation = new int[N];
        int[] yLocation = new int[N];
        int xDistance = 0;
        int yDistance = 0;
        if (N == 0) {
            System.out.println(0);
        }
        for (int i = 0; i < N; i++) {
            xLocation[i] = sc.nextInt();
            yLocation[i] = sc.nextInt();
        }
        Arrays.sort(xLocation);
        Arrays.sort(yLocation);
        xDistance = xLocation[N-1] - xLocation[0];
        yDistance = yLocation[N-1] - yLocation[0];
        System.out.println(xDistance*yDistance);
    }
}