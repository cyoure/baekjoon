import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        long treeCount = 0;

        long[] distanceArr = new long[count-1];
        long[] treeArr = new long[count];
        for (int i = 0; i < count; i++) {
            treeArr[i] = sc.nextLong();
        }
        for (int i = 0; i < count - 1; i++) {
            distanceArr[i] = treeArr[i+1] - treeArr[i];
        }
        long treeLength = distanceArr[0];
        for (int i = 0; i < distanceArr.length; i++) {
            treeLength = calculator(treeLength, distanceArr[i]);
        }
        for (int i = 0; i <distanceArr.length ; i++) {
            treeCount += (distanceArr[i] / treeLength) - 1;
        }
        System.out.println(treeCount);
    }

private static long calculator(long a, long b) {
    while (a % b != 0) {
        long rad = a % b;
        a = b;
        b = rad;
    }
    return b;
    }
}