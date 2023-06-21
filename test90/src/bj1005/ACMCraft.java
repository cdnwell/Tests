package bj1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ACMCraft {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] NandK = br.readLine().split(" ");
            int N = Integer.parseInt(NandK[0]);
            int K = Integer.parseInt(NandK[1]);

            int[] D = new int[N+1];
            String[] DArr = br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                D[j] = Integer.parseInt(DArr[j-1]);
            }

            int[][] DandXY = new int[N+1][N+1];
            for (int j = 0; j < K; j++) {
                String [] XandY = br.readLine().split(" ");
                int X = Integer.parseInt(XandY[0]);
                int Y = Integer.parseInt(XandY[1]);

                DandXY[X][Y] = D[Y];
            }

            int W = Integer.parseInt(br.readLine());

            // 게산하기
            int[] result = new int[N+1];

            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    // 더 큰 값을 대입하기 전 비교하기 위해 값을 준비
                    int cmpTmp = result[k];

                    int tmpResult = 0;
                    if (DandXY[j][k] != 0)
                        tmpResult = DandXY[j][k] + result[j];
                    int beforeResult = Math.max(cmpTmp, tmpResult);
                    result[k] = beforeResult;
                }
            }

            Queue<Integer> queue = new LinkedList<>();

            for (int j = 1; j < result.length; j++) {
                if(result[j] == 0) queue.add(j);
            }

            while(!queue.isEmpty()) {
                int number = queue.poll();
                System.out.println("number : " + number);
                for (int j = 1; j < DandXY[number].length; j++) {
                    DandXY[number][j] += D[number];
                }
            }

            int[] result2 = new int[N+1];

            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    // 더 큰 값을 대입하기 전 비교하기 위해 값을 준비
                    int cmpTmp = 0;
                    if(j < k)
                        cmpTmp = result2[j];
                    else
                        cmpTmp = result2[k];

                    int tmpResult = 0;
                    if (DandXY[j][k] != 0)
                        tmpResult = DandXY[j][k] + result2[j];
                    int beforeResult = Math.max(cmpTmp, tmpResult);
                    result2[k] = beforeResult;
                }
            }

            for (int j = N; j >= 1; j--) {
                for (int k = N; k >= 1; k--) {
                    // 더 큰 값을 대입하기 전 비교하기 위해 값을 준비
                    int cmpTmp = 0;
                    if(j < k)
                        cmpTmp = result2[j];
                    else
                        cmpTmp = result2[k];

                    int tmpResult = 0;
                    if (DandXY[j][k] != 0)
                        tmpResult = DandXY[j][k] + result2[j];
                    int beforeResult = Math.max(cmpTmp, tmpResult);
                    result2[k] = beforeResult;
                }
            }

            sb.append(Arrays.toString(D) + "\n");

            sb.append("--- DandXY ---" + "\n");

            for (int j = 0; j < DandXY.length; j++) {
                sb.append(Arrays.toString(DandXY[j]) + "\n");
            }

            sb.append("--------------\n");

            sb.append(Arrays.toString(result2) + "\n");

            sb.append(result2[W] + "\n");

            // temp
            // 6.21

        }

        System.out.println(sb);

    }

}
