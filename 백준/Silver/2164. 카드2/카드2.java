import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        boolean check = false;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= count; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            if (!check) {
                queue.remove();
                check = true;
            } else {
                int back = queue.poll();
                queue.add(back);
                check = false;
            }
        }
        System.out.println(queue.poll());
    }
}
