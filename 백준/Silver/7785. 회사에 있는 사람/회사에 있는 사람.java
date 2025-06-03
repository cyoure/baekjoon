import java.io.*;
import java.util.Collections;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        TreeSet<String> nameList = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            if (input.split(" ")[1].equals("enter")) {
                nameList.add(input.split(" ")[0]);
            } else {
                nameList.remove(input.split(" ")[0]);
            }
        }
       for (String name : nameList) {
           bw.write(name + "\n");
       }
        bw.flush();
    }
}