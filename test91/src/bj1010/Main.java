package bj1010;

import java.util.Scanner;

public class Main {

    private static int[][] dp = new int[30][30];

    public static void main(String[] args) {
        bottomUpDp();

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            String[] nAndM = sc.nextLine().split(" ");
            int N = Integer.parseInt(nAndM[0]);
            int M = Integer.parseInt(nAndM[1]);

            // [조합]
            // nCr = M-C-N <- M개에서 N개를 고른다.

            sb.append(dp[M][N] + "\n");
        }

        System.out.println(sb);
    }

    public static void bottomUpDp() {
        for (int i = 0; i < 30; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
    }

}
