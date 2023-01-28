package bj1059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodSection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. L, 배열 값 입력
        int L = Integer.parseInt(br.readLine());
        int S[] = new int[L];
        String[] STmp = br.readLine().split(" ");

        // 1.1 배열 S에 입력된 값 넣기
        for (int i = 0; i < L; i++) {
            S[i] = Integer.parseInt(STmp[i]);
        }

        // 1.2 n값 입력 받기
        int n = Integer.parseInt(br.readLine());

        // --- 1. 입력 끝 --- //

        // 문제 풀이
        // [해결법 1]1. n 값이 배열에 있는 경우 0
        // 2. n 값은 S 배열의 두 원소의 사잇값 이어야 한다. (겹치지 않음)
        // 3. n값을 포함하는 [A, B] 배열을 만들기 위해서는, A값이 n부터 시작해야 한다?
        // [해결법 2]4. A는 최소값, B는 최대값 [조건 : A < B] => A != B
        // 배열 S 안의 값을 탐색했을 때 A와 B 값이 같은 경우 0

        int answer = 0;

        // 1.개수가 0인 경우
        // 1.1 n 값이 배열에 있는 경우
        for (int i = 0; i < S.length; i++) {
            if(S[i] == n) {
                answer = 0;
                System.out.println(answer);
                return;
            };
        }

        // * 추가 - 정렬이 안된 경우 정렬
        bubbleSort(S);

        int min = 0;
        int max = 0;

        // 1.2 n 값이 배열의 사잇 값일 경우
        // * 최소값 최대값 구하면서 0인 경우 return;

        // 최소값, 최대값 구하기
        // 2.1. 최소값 구하기
        for (int i = 0; i < S.length; i++) {
            // S배열의 원소가 n을 넘는 경우 break;
            if(S[i]>n) break;
            // S배열의 원소가 n보다 작은 경우 게속해서 min에 대입
            if(S[i]<n) min = S[i];
        }

        // 2.2. 최대값 구하기
        for (int i = 0; i < S.length; i++) {
            // S배열의 원소가 n보다 큰 경우 max에 대입한 뒤 바로 break;
            if(S[i]>n){
                max = S[i];
                break;
            }
        }

        // 3. 최소값, 최대값이 사잇값인지 비교 (0 판별)
        if(max - min == 2){
            answer = 0;
            System.out.println(answer);
            return;
        }

        // * 최소값의 +1, 최대값의 -1이 기준이 되어야 하므로 추가 * //
        min++;
        max--;

        // --- 3. 0인 경우 모두 해결 --- //

        // 4.1 최소값에서 n까지 - 첫 번째 요소
        // 최소값에서 최대값까지 - 첫 번째 마지막 요소
        // (n - 최솟값) * (최댓값 - n + 1) == n값 이전까지의 경우의 모든 가능한 배열
        int total = 0;
        int minToN = (n - min) * (max - n + 1);

        total += minToN;

        // 4.2 n부터 최대값까지
        int NToMax = max - n;

        total += NToMax;

        System.out.println(total);
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
