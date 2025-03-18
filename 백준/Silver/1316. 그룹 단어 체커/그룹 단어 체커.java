import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                String word = sc.next();
                boolean[] checked = new boolean[26];  // 알파벳 체크용 배열
                char prev = '\0';  // 이전 문자
                boolean isGroup = true;

                for (int j = 0; j < word.length(); j++) {
                    char now = word.charAt(j);

                    // 이전 문자와 다를 때
                    if (now != prev) {
                        // 이미 나온 문자면 그룹 단어가 아님
                        if (checked[now - 'a']) {
                            isGroup = false;
                            break;
                        }
                        // 처음 나온 문자면 체크하고 진행
                        checked[now - 'a'] = true;
                        prev = now;
                    }
                }

                if (isGroup) {
                    cnt++;
                }
            }

            System.out.println(cnt);
            sc.close();
        }
    }
