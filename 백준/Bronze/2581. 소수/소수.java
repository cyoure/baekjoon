import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> lists = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j != 1 && j != i) {
                    break;
                } else if (j == i && i != 1) {
                    lists.add(i);
                }
            }
        }
        if (lists.isEmpty()) {
            System.out.println(-1);
        } else {
            for (Integer list : lists) {
                sum += list;
            }
            System.out.println(sum);
            System.out.println(lists.get(0));
        }
    }
}