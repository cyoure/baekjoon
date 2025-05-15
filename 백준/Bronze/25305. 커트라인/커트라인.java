import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personnel = sc.nextInt();
        int award = sc.nextInt();
        int[] scores = new int[personnel];
        for (int i = 0; i < personnel; i++) {
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        System.out.println(scores[personnel - award]);
    }
}
