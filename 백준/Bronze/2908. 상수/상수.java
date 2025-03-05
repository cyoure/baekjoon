import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =  sc.nextInt();
        int B =  sc.nextInt();
        String c = "";
        String d = "";
        String a = Integer.toString(A);
        String b = Integer.toString(B);

        for (int i = a.length()-1; i >= 0; i--) {
            c += a.charAt(i);
            d += b.charAt(i);
        }
        A = Integer.valueOf(c);
        B = Integer.valueOf(d);
       if (A>B) {
           System.out.println(A);
       } else {
           System.out.println(B);
       }
    }
}
