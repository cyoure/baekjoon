import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            String str = sc.next();
        for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty()) {
                    stack.push(str.charAt(j));
                } else if (stack.peek().equals(str.charAt(j))) {
                    stack.push(str.charAt(j));
                } else if (stack.peek() == ')') {
                    break;
                } else {
                    stack.pop();
                }

            }
            if (!stack.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            stack.clear();
        }
    }
}