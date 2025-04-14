import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] distances = {1,1,1};
        while (true) {
            distances[0] = sc.nextInt();
            distances[1] = sc.nextInt();
            distances[2] = sc.nextInt();
            if (distances[0] == 0 && distances[1] == 0 && distances[2] == 0) {
                break;
            }
            Arrays.sort(distances);
            if (distances[0] == distances[1] && distances[0] == distances[2]) {
                System.out.println("Equilateral");
            } else if (distances[2] < distances[0] + distances[1] && (distances[2] == distances[1] ||
                    distances[0] == distances[2] || distances[0] == distances[1])) {
                System.out.println("Isosceles");
            } else if (distances[2] < distances[0] + distances[1]) {
                System.out.println("Scalene");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}