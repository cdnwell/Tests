package bj1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PutBridge {
    public static int[][] dp = new int[30][30];

    public static int combi (int n,int r) {
        // 이미 풀린 경우 바로 반환
        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        // 2번 성질
        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        // 1번 성질
        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split(" ");
            int N = Integer.parseInt(arr[0]);
            int M = Integer.parseInt(arr[1]);

            int result = combi(M,N);
            sb.append(result + "\n");
        }

        System.out.println(sb);
    }

}
