import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Stack<Integer> lineStack = new Stack<>();
        Stack<Integer> outLineStack = new Stack<>();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = count - 1; i >= 0; i--) {
            lineStack.push(arr[i]);
        }
        while (lineStack.peek() != 1) {
            outLineStack.push(lineStack.peek());
            lineStack.pop();
        }
        for (int i = 1; i <= count; i++) {
            if (!outLineStack.isEmpty() && outLineStack.peek() == i) {
                outLineStack.pop();
            } else if (!lineStack.isEmpty() && lineStack.peek() == i) {
                lineStack.pop();
            } else {
                while (!lineStack.isEmpty() && lineStack.peek() != i) {
                    outLineStack.push(lineStack.peek());
                    lineStack.pop();

                    if (!outLineStack.isEmpty() && outLineStack.peek() == i) {
                        outLineStack.pop();
                        break;
                    } else if (!lineStack.isEmpty() && lineStack.peek() == i) {
                        lineStack.pop();
                        break;
                    }
                }
            }
        }
        if (outLineStack.isEmpty() && lineStack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
