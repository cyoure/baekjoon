import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strCount = br.readLine().split(" ");
        int count = 0;
        int aCount = Integer.parseInt(strCount[0]);
        int bCount = Integer.parseInt(strCount[1]);
        HashSet<Integer> aSet = new HashSet<>();
        String[] set  = br.readLine().split(" ");
        for (int i = 0; i < aCount; i++) {
            aSet.add(Integer.parseInt(set[i]));
        }
        set  = br.readLine().split(" ");
        for (int i = 0; i < bCount; i++) {
            if (aSet.contains(Integer.parseInt(set[i]))) {
                count++;
            }
        }
        int answer = (aCount - count) + (bCount - count);
        bw.write(Integer.toString(answer));
        br.close();
        bw.close();
    }
}