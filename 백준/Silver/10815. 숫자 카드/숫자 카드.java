import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 상근이가 가진 카드 개수 N
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> cardSet = new HashSet<>();

        // 카드 숫자 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }

        // 확인할 숫자 개수 M
        int M = Integer.parseInt(br.readLine());

        // M개의 수 확인 및 결과 저장
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (cardSet.contains(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}
