import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        // 첫 번째 입력: 주어진 값들의 빈도 계산
        int givenCount = Integer.parseInt(br.readLine());
        String[] givenValues = br.readLine().split(" ");
        for (String value : givenValues) {
            frequencyMap.merge(value, 1, Integer::sum);
        }

        // 두 번째 입력: 기대 값들에 대해 빈도 출력
        int expectedCount = Integer.parseInt(br.readLine());
        String[] expectedValues = br.readLine().split(" ");
        for (String value : expectedValues) {
            bw.write(frequencyMap.getOrDefault(value, 0) + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}