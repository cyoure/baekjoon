import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        int[] pay = new int[T];

        for (int i = 0; i < T; i++) {
            int quarter = 0;
            int dim = 0;
            int nick = 0;
            int penny = 0;
            pay[i] = sc.nextInt();
            while(pay[i] >= 25) {
                    pay[i] = pay[i] - 25;
                    quarter++;
                }
                while(pay[i] >= 10) {
                    pay[i] = pay[i] - 10;
                    dim++;
                }
                while(pay[i] >= 5) {
                    pay[i] = pay[i] - 5;
                    nick++;
                }
                while(pay[i] != 0) {
                    pay[i] = pay[i] - 1;
                    penny++;
                }
            System.out.println(quarter + " " + dim + " " + nick + " " + penny);
        }

    }
}
