import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        for (;;) {
            String str = sc.nextLine();
            if (str.equals(".")) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                } else if (stack.isEmpty() && str.charAt(i) == ')' || stack.isEmpty() && str.charAt(i) == ']') {
                    stack.push(str.charAt(i));
                    break;
                } else if ((!stack.isEmpty() && stack.peek().equals('[') &&str.charAt(i) == ')') || (!stack.isEmpty() && stack.peek().equals('(') && str.charAt(i) == ']')) {
                    stack.push(str.charAt(i));
                    break;
                }
                else if ((!stack.isEmpty() && stack.peek().equals('(') && str.charAt(i) == ')') || (!stack.isEmpty() && stack.peek().equals('[') && str.charAt(i) == ']')) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            stack.clear();
        }
    }
}