import java.io.*;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int emojiCount = 0;
        HashSet<String> emojiSet = new HashSet<>();
        br.readLine();
        for (int i = 0; i < count-1; i++) {
            emojiSet.add(br.readLine());
            if (emojiSet.contains("ENTER")) {
                emojiCount += emojiSet.size() -1 ;
                emojiSet.clear();
            }
        }
        emojiCount += emojiSet.size();
        bw.write(String.valueOf(emojiCount));
        bw.flush();
        br.close();
        bw.close();
    }
}