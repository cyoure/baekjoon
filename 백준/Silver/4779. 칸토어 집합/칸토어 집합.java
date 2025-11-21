import java.io.*;

public class Main {
    static StringBuilder answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st;
        while ((st = br.readLine()) != null && !st.isEmpty()) {
            int num = Integer.parseInt(st);
            answer = new StringBuilder();
            int length = (int) Math.pow(3, num);
            for (int i = 0; i < length; i++) {
                answer.append("-");
            }
            cantor(0, (int) Math.pow(3, num));
          bw.write(String.valueOf(answer));
          bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static void cantor(int start, int length) {
        if (length == 1) {
            return;
        }
        int newLength = length / 3;
        for (int i = start + newLength; i < start+2*newLength; i++) {
           answer.setCharAt(i, ' ');
        }
        cantor(start, newLength);
        cantor(start+2*newLength, newLength);
    }
}