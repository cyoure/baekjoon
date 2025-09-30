import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] stackOrQueue = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            stackOrQueue[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> popArray = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            if (stackOrQueue[i] == 0) {
                popArray.add(Integer.parseInt(st.nextToken()));
            } else {
                st.nextToken();
            }
        }
        count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] pushArray = new int[count];
        for (int i = 0; i < count; i++) {
            pushArray[i] = Integer.parseInt(st.nextToken());
        }
        if (count - popArray.size() >= 0) {
            for (int i = popArray.size() - 1; i >= 0; i--) {
                bw.write(popArray.get(i) + " ");
            }
            for (int i = 0; i < count - popArray.size(); i++) {
                bw.write(pushArray[i] + " ");
            }
        } else {
            for (int i = popArray.size() - 1; i >= popArray.size() - count; i--) {
                bw.write(popArray.get(i) + " ");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}