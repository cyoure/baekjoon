import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int count = 1;
        if (A.charAt(0) == ' ') {
            count = 0;
        }
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == ' ') {
                count++;
            }
        }
        if (A.charAt(A.length() - 1) == ' ') {
            count--;
        }
        System.out.println(count);
    }
}
