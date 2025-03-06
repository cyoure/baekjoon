import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= 'A' && A.charAt(i) <= 'C') {
                count += 3;
            } else if (A.charAt(i) >= 'D' && A.charAt(i) <= 'F') {
                count += 4;
            } else if (A.charAt(i) >= 'G' && A.charAt(i) <= 'I') {
                count += 5;
            } else if (A.charAt(i) >= 'J' && A.charAt(i) <= 'L') {
                count += 6;
            } else if (A.charAt(i) >= 'M' && A.charAt(i) <= 'O') {
                count += 7;
            } else if (A.charAt(i) >= 'P' && A.charAt(i) <= 'S') {
                count += 8;
            } else if (A.charAt(i) >= 'T' && A.charAt(i) <= 'V') {
                count += 9;
            } else if (A.charAt(i) >= 'W' && A.charAt(i) <= 'Z') {
                count += 10;
            }
        }
        System.out.println(count);
    }
}