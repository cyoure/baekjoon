import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;
        for (int i = 0; i < count; i++) {
            String command = br.readLine();
            if (command.split(" ")[0].equals("push")) {
                queue.add(Integer.parseInt(command.split(" ")[1]));
                last = Integer.parseInt(command.split(" ")[1]);
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write(String.valueOf(-1));
                } else {
                    bw.write(String.valueOf(queue.remove()));
                }
                bw.newLine();
            } else if (command.equals("size")) {
                bw.write(String.valueOf(queue.size()));
                bw.newLine();
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write(String.valueOf(1));
                } else {
                    bw.write(String.valueOf(0));
                }
                bw.newLine();
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write(String.valueOf(-1));
                } else {
                    bw.write(String.valueOf(queue.peek()));
                }
                bw.newLine();
            } else {
                if (queue.isEmpty()) {
                    bw.write(String.valueOf(-1));
                } else {
                    bw.write(String.valueOf(last));
                }
                bw.newLine();
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}