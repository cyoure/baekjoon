import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[][] memberArr = new String[number][2];
        for (int i = 0; i <number; i++) {
            for (int j = 0; j < 2; j++) {
                memberArr[i][j] = sc.next();
            }
        }
        Arrays.sort(memberArr, (o1, o2) -> {
           int num1 = Integer.parseInt(o1[0]);
           int num2 = Integer.parseInt(o2[0]);
           if (num1 == num2) {
               return 0;
           }
           return num1 - num2;
        });
        for (int i = 0; i <number; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(memberArr[i][j] + " ");
            }
        }
    }
}