import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int firstNum = 0;
        int secondNum = 0;
        for (int i = 0; i < count; i++) {
            firstNum = sc.nextInt();
            secondNum = sc.nextInt();

            int mul = firstNum * secondNum;
            if (firstNum >= secondNum) {
                while (firstNum % secondNum != 0) {
                    int remain = firstNum % secondNum;
                    firstNum = secondNum;
                    secondNum = remain;
                }
                System.out.println(mul / secondNum);
            } else {
                while (secondNum % firstNum != 0) {
                    int remain = secondNum % firstNum;
                    secondNum = firstNum;
                    firstNum = remain;
                }
                System.out.println(mul / firstNum);
            }
        }
    }
}