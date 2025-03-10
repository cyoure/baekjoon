import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String term = sc.nextLine();
        String reverseTerm = "";
        for (int i = term.length()-1; i >= 0; i--) {
            reverseTerm = reverseTerm + term.charAt(i);
        }
        if (term.equals(reverseTerm)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}