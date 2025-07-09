import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstNum = sc.nextInt();
        long secondNum = sc.nextInt();
        long mul = firstNum * secondNum;
        if (firstNum >= secondNum) {
            while (firstNum % secondNum != 0) {
                long remain = firstNum % secondNum;
                firstNum = secondNum;
                secondNum = remain;
            }
            System.out.println(mul / secondNum);
        } else {
            while (secondNum % firstNum != 0) {
                long remain = secondNum % firstNum;
                secondNum = firstNum;
                firstNum = remain;
            }
            System.out.println(mul / firstNum);
        }
    }
}