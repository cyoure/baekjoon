import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        HashSet<String> dancingMan = new HashSet<>();
        dancingMan.add("ChongChong");
        for (int i = 0; i < count; i++) {
            String man = sc.nextLine();
            String firstMan = man.split(" ")[0];
            String secondMan = man.split(" ")[1];
            if (dancingMan.contains(firstMan)) {
                    dancingMan.add(secondMan);
            } else if (dancingMan.contains(secondMan)) {
                    dancingMan.add(firstMan);
            }
        }
        System.out.println(dancingMan.size());
    }
}