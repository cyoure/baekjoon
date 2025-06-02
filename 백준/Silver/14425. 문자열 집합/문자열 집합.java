import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int verifyCount = sc.nextInt();
        String[] givenArr = new String[count];
        String[] verifyArr = new String[verifyCount];
        int correctCount = 0;
        for (int i = 0; i < count; i++) {
                givenArr[i] = sc.next();
            }
        for (int i = 0; i < verifyCount; i++) {
            verifyArr[i] = sc.next();
        }
        
        for (int i = 0; i < givenArr.length; i++) {
            for (int j = 0; j < verifyArr.length; j++) {
                if (givenArr[i].equals(verifyArr[j])) {
                    correctCount++;
                }
            }
        }
        System.out.println(correctCount);
    }
}