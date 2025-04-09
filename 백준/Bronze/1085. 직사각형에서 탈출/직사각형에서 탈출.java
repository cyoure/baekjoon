import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xLength = 0;
        int yLength = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        if ((double) w/2 > x) {
            xLength = x;
        } else {
            xLength = w-x;
        }
        if ((double)h/2 > y) {
            yLength = y;
        } else {
            yLength = h-y;
        }
        System.out.println(Math.min(xLength, yLength));
    }
}