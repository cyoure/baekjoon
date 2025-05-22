import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String splitNum = Integer.toString(n);
        int[] splitNumArr = new int[splitNum.length()];
        for (int i = 0; i < splitNum.length(); i++) {
            splitNumArr[i] = splitNum.charAt(i) - '0';
        }
        Arrays.sort(splitNumArr);
        for (int i = splitNumArr.length - 1; i >= 0; i--) {
            System.out.print(splitNumArr[i]);
        }
    }
}