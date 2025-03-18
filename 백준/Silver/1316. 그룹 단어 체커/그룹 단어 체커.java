import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            String term = sc.next();
            boolean check = true;
            for (int j = 0; j < term.length(); j++) {
                char current = term.charAt(j);
                while (j+1 < term.length() && term.charAt(j+1) == current) {
                    j++;
                }
                for (int k = j+1; k < term.length(); k++) {
                    if (term.charAt(k) == current) {
                        check = false;
                        break;
                    }
                }
                if (!check) {
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        System.out.println(count);
    }
}