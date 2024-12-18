import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
            int T = Integer.parseInt(bf.readLine()); //Int
            int[] sum = new int[T];
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

            for (int i = 0; i  < T; i++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                int A = Integer.parseInt(st.nextToken()); //첫번째 호출
                int B = Integer.parseInt(st.nextToken()); //두번째 호출
                sum[i] = A + B;

            }
            for (int i = 0; i < sum.length; i++) {
                bw.write(sum[i] + "\n");
            }
            bw.flush();
            bw.close();

        }
}
