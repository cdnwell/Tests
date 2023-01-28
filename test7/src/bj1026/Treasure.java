package bj1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Treasure {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        // 1.1. A 값을 받고 배열에 담는다.
        String[] AStr = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(AStr[i]);
        }

        // 1.2. B 값을 받고 배열에 담는다.
        String[] BStr = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(BStr[i]);
        }

        // --- 1. 입력 완료 --- //

        // 2.1 A 배열 오름 차순 정렬
        bubbleSort(true, A);
        // 2.2 B 배열 내림 차순 정렬 ( A와 B가 같은 인덱스 인 경우 둘 의 합은 최소값이 된다.)
        bubbleSort(false,B);

        int total = 0;

        // 3. 정렬된 배열의 같은 인덱스에 해당하는 값 곱해서 더하기
        for (int i = 0; i < A.length; i++) {
            total += A[i] * B[i];
        }

        // 4. 출력 (정답)
        System.out.println(total);

    }

    public static void bubbleSort(boolean asc, int[] arr) {
        // 1. boolean 값 설명
        // asc : true (오름차순 정렬)
        // asc : false (내림차순 정렬)

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(asc){
                    // 2.1 오름차순(asc) 정렬 인 경우
                    if(arr[j] > arr[j+1]){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                } else {
                    // 2.2 내림차순(desc) 정렬 인 경우
                    if(arr[j] < arr[j+1]){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
        }
    }

}
