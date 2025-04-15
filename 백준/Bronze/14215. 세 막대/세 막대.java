import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] distances = new int[3];
        distances[0] = sc.nextInt();
        distances[1] = sc.nextInt();
        distances[2] = sc.nextInt();
        Arrays.sort(distances);
        if (distances[2] >= distances[0] + distances[1]) {
            distances[2] = distances[1] + distances[0]-1;
        }
        System.out.println(distances[0]+distances[1]+distances[2]);
    }
}