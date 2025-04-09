import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lists = new ArrayList<Integer>();
        int N = sc.nextInt();
        if (N == 1) {
            System.out.println();
        } else {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    N = N / i;
                    lists.add(i);
                    i--;
                }
            }
        }
        for (Integer list : lists) {
            System.out.println(list);
        }
    }
}