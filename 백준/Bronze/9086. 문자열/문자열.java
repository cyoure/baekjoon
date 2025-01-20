import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] names = new String[T];
        for (int i = 0; i < T; i++) {
            names[i] = sc.next();
        }
        for (int i = 0; i < T; i++) {
            if (names[i].length() == 1) {
                System.out.println(names[i] + names[i]);
            } else {
                System.out.println(names[i].substring(0,1) + names[i].charAt(names[i].length()-1));
            }
        }
    }
}