import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] correctArr = {1,2,3,4,5,6,7,8};
        int[] reverseArr = {8,7,6,5,4,3,2,1};
        int[] arr = new int[8];
        int correctCount = 0;
        int reverseCount = 0;
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            if (arr[i] == correctArr[i]) {
                correctCount++;
            } else if (arr[i] == reverseArr[i]) {
                reverseCount++;
            }
        }
        if (correctCount == 8) {
            System.out.println("ascending");
        } else if (reverseCount == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}