import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            arr [i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i : arr) {
            bw.write(i + "\n");
        }
        br.close();
        bw.close();
    }
}