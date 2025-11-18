import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] tmp;
    static int count = 0;
    static int findNum;
    static int answer = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrSize = Integer.parseInt(st.nextToken());
        findNum = Integer.parseInt(st.nextToken());
        int[] arr = new int[arrSize];
        tmp = new int[arrSize];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrSize; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        mergeSort(arr, 0, arrSize - 1);

        bw.write(String.valueOf(answer));
        bw.flush();
        br.close();
        bw.close();
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;       // q는 p, r의 중간 지점
            mergeSort(arr, start, middle);      // 전반부 정렬
            mergeSort(arr, middle + 1, end);  // 후반부 정렬
            merge(arr, start, middle, end);       // 병합
        }
    }

    public static void merge(int[] arr, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int t = 0;

        // (1) 두 부분 배열을 비교하며 tmp에 저장
        // while (i ≤ q and j ≤ r)
        while (i <= middle && j <= end) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++]; // tmp[t] <- A[i]; t++; i++;
            } else {
                tmp[t++] = arr[j++]; // tmp[t] <- A[j]; t++; j++;
            }
        }

        // (2) 한쪽 배열에 값이 남은 경우 tmp에 마저 저장
        // while (i ≤ q) # 왼쪽 배열 부분이 남은 경우
        while (i <= middle) {
            tmp[t++] = arr[i++];
        }
        // while (j ≤ r) # 오른쪽 배열 부분이 남은 경우
        while (j <= end) {
            tmp[t++] = arr[j++];
        }

        // (3) 결과를 A[p..r]에 "저장" (!!! 바로 이 부분 !!!)
        i = start; // i <- p (A 배열에 저장할 위치)
        t = 0; // t <- 1 (tmp 배열에서 가져올 위치, 0-based)

        // while (i ≤ r)
        while (i <= end) {
            arr[i] = tmp[t]; // A[i++] <- tmp[t++]

            // --- 문제의 핵심 로직 ---
            count++; // "저장" 횟수 1 증가
            if (count == findNum) {
                answer = arr[i]; // K번째 저장되는 수를 answer에 기록
            }
            // ---------------------

            i++;
            t++;
        }
    }
}