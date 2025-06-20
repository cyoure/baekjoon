import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] strCount = br.readLine().split(" ");
        int unListenCount = Integer.parseInt(strCount[0]);
        int unSeenCount = Integer.parseInt(strCount[1]);
        int count = 0;
        HashSet<String> unListenSet = new HashSet<>();
        ArrayList<String> commonArr = new ArrayList<>();
        for (int i = 0; i < unListenCount; i++) {
            unListenSet.add(br.readLine());
        }
        for (int i = 0; i < unSeenCount; i++) {
            String name = br.readLine();
            if (unListenSet.contains(name)) {
                commonArr.add(name);
            }
        }
        Collections.sort(commonArr);
        for (int i = 0; i < commonArr.size(); i++) {
            sb.append(commonArr.get(i) + "\n");
        }
        bw.write(commonArr.size() + "\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}