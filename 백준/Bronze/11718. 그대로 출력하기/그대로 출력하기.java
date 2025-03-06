import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }
            System.out.println(s);
        }
    }
}