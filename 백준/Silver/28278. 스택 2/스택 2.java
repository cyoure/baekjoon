import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            String strNum = br.readLine();
            int num = Integer.parseInt(strNum.split(" ")[0]);
            if (num == 1) {
                int putNum = Integer.parseInt(strNum.split(" ")[1]);
                stack.add(putNum);
            } else if (num == 2) {
                if (stack.isEmpty()) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(stack.peek()));
                    bw.newLine();
                    stack.pop();
                }
            } else if (num == 3) {
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } else if (num == 4) {
                if (stack.isEmpty()) {
                    bw.write(String.valueOf(1));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(0));
                    bw.newLine();
                }
            } else {
                if (stack.isEmpty()) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(stack.peek()));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}