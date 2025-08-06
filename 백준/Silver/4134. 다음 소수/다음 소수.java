import java.util.Scanner;

public class Main {
    // 소수 판별 함수
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        // 홀수만 검사하여 효율성 향상
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    // n보다 크거나 같은 가장 작은 소수 찾기
    public static long findNextPrime(long n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 개수 입력
        int T = sc.nextInt();
        
        // 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            long n = sc.nextLong();
            System.out.println(findNextPrime(n));
        }
        
        sc.close();
    }
}