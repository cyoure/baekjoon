import java.io.*;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputCount = br.readLine().split(" ");
        int givencount = Integer.parseInt(inputCount[0]);
        int verifiedcount = Integer.parseInt(inputCount[1]);
        LinkedHashMap<Integer, String> givenArr = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> givenReverseArr = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> verifiedArr = new LinkedHashMap<>();
        for (int i = 1; i <= givencount; i++) {
            String line = br.readLine();
            givenArr.put(i, line);
            givenReverseArr.put(line, i);

        }
        for (int i = 1; i <= verifiedcount; i++) {
            verifiedArr.put(i, br.readLine());
        }
       for (int i = 1; i <= verifiedcount; i++) {
           if (verifiedArr.get(i).matches("[-+]?\\d*\\.?\\d+")) {
               bw.write(givenArr.get(Integer.parseInt(verifiedArr.get(i))) + "\n");
           } else {
              bw.write(String.valueOf(givenReverseArr.get(verifiedArr.get(i))) + "\n");
           }
       }
       bw.flush();
    }
}