import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstNumber = sc.nextLong();
        long secondNumber = sc.nextLong();
        long thirdNumber = sc.nextLong();
        int counter = 0;
        long mul = firstNumber * secondNumber * thirdNumber;
        String strMul = Long.toString(mul);
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < strMul.length(); j++) {
                if (strMul.charAt(j) == String.valueOf(i).charAt(0)) {
                    counter++;
                }
            }
            System.out.println(counter);
            counter = 0;
        }

    }
}