import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < line.length; j++) {
                arr[i][j] = line[j];
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == null) {
                    arr[j][i] = "";
                }
                System.out.print(arr[j][i]);
            }
        }
    }
}

