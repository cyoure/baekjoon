import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < count; i++) {
            String strNum = br.readLine();
            int select = Integer.parseInt(strNum.split(" ")[0]);
            if (select == 1) {
                int push = Integer.parseInt(strNum.split(" ")[1]);
                deque.addFirst(push);
            } else if (select == 2) {
                int push = Integer.parseInt(strNum.split(" ")[1]);
                deque.addLast(push);
            } else if (select == 3) {
                if (deque.isEmpty()) {
                    bw.write(String.valueOf(-1));
                } else {
                    bw.write(String.valueOf(deque.removeFirst()));
                }
                bw.newLine();
            } else if (select == 4) {
                if (deque.isEmpty()) {
                    bw.write(String.valueOf(-1));
                } else {
                    bw.write(String.valueOf(deque.removeLast()));
                }
                bw.newLine();
            } else if (select == 5) {
                bw.write(String.valueOf(deque.size()));
                bw.newLine();
            } else if (select == 6) {
                if (deque.isEmpty()) {
                    bw.write(String.valueOf(1));
                } else {
                    bw.write(String.valueOf(0));
                }
                bw.newLine();
            } else if (select == 7) {
                if (deque.isEmpty()) {
                    bw.write(String.valueOf(-1));
                } else {
                    bw.write(String.valueOf(deque.getFirst()));
                }
                bw.newLine();
            } else {
                if (deque.isEmpty()) {
                    bw.write(String.valueOf(-1));
                } else {
                    bw.write(String.valueOf(deque.getLast()));
                }
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}