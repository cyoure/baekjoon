import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int mom = 1;
        int child = 1;
        int i = 1;
        while(i < x) {
            if ((mom + child) % 2 != 0 && mom == 1) {
                child++;
                i++;
            } else if ((mom + child) % 2 == 0 && child == 1) {
                mom++;
                i++;
            } else {
                if ((mom + child) % 2 != 0) {
                    child++;
                    mom--;
                } else {
                    child--;
                    mom++;
                }
                i++;
            }
        }
        System.out.println(child  +"/" + mom);
    }
}