import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String term = br.readLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 1; i <= term.length(); i++) {
            for (int j = 0; j < term.length(); j++) {
                if (j+i <= term.length()) {
                    set.add(term.substring(j, j+i));
                }
            }
        }
        bw.write(Integer.toString(set.size()));
        bw.close();
    }
}