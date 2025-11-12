import java.util.Scanner;

public class Main {
    public static String recursion(String s, int l, int r, int functionThrowCount){
        if(l >= r) return "1" + " " + functionThrowCount;
        else if(s.charAt(l) != s.charAt(r)) return "0" + " " +functionThrowCount;
        else {
            functionThrowCount++;
            return recursion(s, l+1, r-1, functionThrowCount);
    }
    }
    public static String isPalindrome(String s, int functionThrowCount){
        return recursion(s, 0, s.length()-1 , functionThrowCount);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        int functionThrowCount = 1;
        for (int i = 0; i < count; i++) {
            String s = sc.nextLine();
            System.out.println(isPalindrome(s, functionThrowCount));
        }
    }
}