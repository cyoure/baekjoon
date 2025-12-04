import java.util.Scanner;

public class Main {
        // N: 1부터 N까지의 자연수 범위
        // M: 수열의 길이
        private static int N, M;

        private static int[] selected;

        // StringBuilder를 사용하여 출력 성능 향상
        private static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // N과 M 입력
            N = sc.nextInt();
            M = sc.nextInt();

            // 배열 초기화
            selected = new int[M];
            // 재귀 함수 호출 시작 (depth 0부터 시작)
            findSequences(0, 1);

            // 결과 출력
            System.out.print(sb.toString());

            sc.close();
        }

        /**
         * 길이가 M인 수열을 재귀적으로 찾는 함수 (백트래킹)
         * * @param depth 현재 수열에 채워야 할 위치 (0부터 M-1까지)
         */
        private static void findSequences(int depth, int start) {
            // 1. 종료 조건 (Base Case)
            // M개의 숫자를 모두 선택했을 경우
            if (depth == M) {
                // 현재 선택된 수열을 StringBuilder에 추가
                for (int i = 0; i < M; i++) {
                    sb.append(selected[i]).append(" ");
                }
                sb.append("\n"); // 수열 출력 후 줄 바꿈
                return;
            }

            // 2. 재귀 호출 (Recursive Step)
            // 1부터 N까지의 자연수 중 다음 숫자를 선택
            for (int i = start; i <= N; i++) {
                // 중복 없이 M개를 골라야 하므로, 이미 사용된 숫자는 건너뛴다.
                    selected[depth] = i;

                    findSequences(depth + 1, i + 1);

                }
            }
        }
