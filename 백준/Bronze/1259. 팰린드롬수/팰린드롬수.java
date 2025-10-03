import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        while(true) {
            String result = "yes";
            int n = sc.nextInt();
            if (n == 0) break;
            String strNum = Integer.toString(n);
            for (int i = 0; i < strNum.length(); i++) {
                numList.add(Integer.parseInt(strNum.substring(i, i + 1)));
            }
            for (int i = 0; i < numList.size() / 2; i++) {
                if (numList.get(i) == numList.get(numList.size() - 1 - i)) {
                    result = "yes";
                } else {
                    result = "no";
                    break;
                }
            }
            System.out.println(result);
            numList.clear();
        }
    }
}