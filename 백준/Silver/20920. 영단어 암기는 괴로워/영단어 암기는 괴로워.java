import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int termNum = Integer.parseInt(st.nextToken());
        int termLength = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < termNum; i++) {
            String term = br.readLine();
            if (term.length() >= termLength) {
                list.add(term);
            }
        }

        for (String string : list) {
                map.put(string, map.getOrDefault(string, 0) + 1);
        }
        list.sort((value1, value2) -> {
                int freq1 = map.get(value1);
                int freq2 = map.get(value2);
                if (freq1 != freq2) {
                    return freq2 - freq1;
                }
            int len1 = value1.length();
            int len2 = value2.length();

            if (len1 != len2) {

                return len2 - len1;
            }
            return value1.compareTo(value2);
        });
        LinkedHashSet<String> set = new LinkedHashSet<>(list);
        List<String> newList = new ArrayList<>(set);
        for (String string : newList) {
            bw.write(string);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}