import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] sum = new int[count];
        for (int i = 0; i < count; i++) {
            sum [i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(sum);
        for (int i : sum) {
            System.out.println(i);
        }
        
    }
}