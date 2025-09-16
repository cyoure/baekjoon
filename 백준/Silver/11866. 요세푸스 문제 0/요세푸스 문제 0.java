import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int num = sc.nextInt();
        int j = 0;
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[count];
        for (int i = 1; i <= count; i++) {
            queue.add(i);
        }
        while (queue.size() > 0) {
            for (int i = 0; i < num-1; i++) {
                queue.add(queue.poll());
            }
            arr[j] = queue.remove();
            j++;
        }
        System.out.print("<");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print(">");
    }
}