package bj1010;

public class PutABridge {

    private static int[][] dp = new int[30][30];

    public static void main(String[] args) {
        // n+1Cr+1 = nCr + nCr+1
        // nCn = nC0 = 1
        // nCr = nPr / r
        // nCr = n! / ((n-r)! * r)
        // n!의 값이 29까지 가면 매우 커져 21억을 넘게된다.
        // 그래서 dp를 통해 문제를 풀어주어야 함.

        // bottom-up 방식
        // nCn = nC0 = 1 을 대입해주는 코드
        for (int i = 0; i < 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        // n+1Cr+1 = nCr + nCr+1
        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        System.out.println("dp[2][2] " + dp[2][2]);
        System.out.println("dp[1][5] " + dp[5][1]);
        System.out.println("dp[13][29] " + dp[29][13]);
    }

}
