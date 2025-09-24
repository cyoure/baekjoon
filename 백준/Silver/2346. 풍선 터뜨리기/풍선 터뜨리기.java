import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        int[] deleteNums = new int[count];
        int[] orderArr = new int[count];
        int j = 0;
        for (int i = 0; i < count; i++) {
            orderArr[i] = sc.nextInt();
        }
        for (int i = 1; i <= count; i++) {
            deque.addLast(i);
        }
        deleteNums[0] = deque.removeFirst();
        while (!deque.isEmpty()) {
            if (orderArr[deleteNums[j]-1] > 0) {
                for (int i = 0; i < orderArr[deleteNums[j]-1] -1; i++) {
                    deque.addLast(deque.removeFirst());
                }
                deleteNums[j + 1] = deque.removeFirst();
            } else {
                for (int i = 0; i < Math.abs(orderArr[deleteNums[j]-1]) -1; i++) {
                    deque.addFirst(deque.removeLast());
                }
                deleteNums[j + 1] = deque.removeLast();
            }
            j++;
        }
        for (int deleteNum : deleteNums) {
            System.out.print(deleteNum + " ");
        }
    }
}
