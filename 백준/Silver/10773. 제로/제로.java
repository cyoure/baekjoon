import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            int pushNum = sc.nextInt();
            if (pushNum == 0) {
                stack.pop();
            } else {
                stack.push(pushNum);
            }
        }
        for (Integer integer : stack) {
            sum += integer;
        }
        System.out.println(sum);
    }
}