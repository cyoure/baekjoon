import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = 1;
        int secondNum = 1;
        while (true) {
            firstNum = sc.nextInt();
            secondNum = sc.nextInt();
            if (firstNum == 0 && secondNum == 0) {
                break;
            }
            if (firstNum < secondNum && secondNum % firstNum == 0) {
                System.out.println("factor");
            } else if (firstNum > secondNum && firstNum % secondNum == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}