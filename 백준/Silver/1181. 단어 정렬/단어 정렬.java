import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] textArr = new String[n];
        for (int i = 0; i < n; i++) {
            textArr[i] = sc.next();
        }
        textArr = Arrays.stream(textArr).distinct().toArray(String[]::new);
        Arrays.sort(textArr, (o1, o2) -> {
            if(o1.length() != o2.length()) {
               return o1.length() - o2.length();}
            return o1.compareTo(o2);
        });
        for (String string : textArr) {
            System.out.println(string);
        }
    }
}
