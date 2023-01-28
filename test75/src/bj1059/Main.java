package bj1059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int S[] = new int[L];
        String[] STmp = br.readLine().split(" ");

        for (int i = 0; i < L; i++) {
            S[i] = Integer.parseInt(STmp[i]);
        }

        int n = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 0; i < S.length; i++) {
            if(S[i] == n) {
                answer = 0;
                System.out.println(answer);
                return;
            };
        }

        bubbleSort(S);

        int min = 0;
        int max = 0;

        for (int i = 0; i < S.length; i++) {
            if(S[i]>n) break;
            if(S[i]<n) min = S[i];
        }

        for (int i = 0; i < S.length; i++) {
            if(S[i]>n){
                max = S[i];
                break;
            }
        }

        if(max - min == 2){
            answer = 0;
            System.out.println(answer);
            return;
        }

        min++;
        max--;

        int total = 0;
        int minToN = (n - min) * (max - n + 1);

        total += minToN;

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
