import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String term = sc.nextLine();
        term = term.toUpperCase();
        int count = 0;
        int maxCount = 0;
        char maxTerm = ' ';
        if (term.length() == 1) {
            maxTerm = term.charAt(0);
        }
        char[] charsArr = term.toCharArray();
        Arrays.sort(charsArr);
        for (int i = 1; i < charsArr.length; i++) {
            if (charsArr[i-1] == charsArr[i]) {
                count++;
            } else {
                count = 0;
            }
            if (i == 1 && charsArr.length != 2) {
                maxCount = count;
                maxTerm = charsArr[i];
            } else if (count > maxCount) {
                maxCount = count;
                maxTerm = charsArr[i];
            } else if (maxCount == count) {
                maxTerm = '?';
            }
        }
        System.out.println(maxTerm);
    }
}