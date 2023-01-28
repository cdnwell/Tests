package bj1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] startEnd = br.readLine().split(" ");
            int x1 = Integer.parseInt(startEnd[0]);
            int y1 = Integer.parseInt(startEnd[1]);
            int x2 = Integer.parseInt(startEnd[2]);
            int y2 = Integer.parseInt(startEnd[3]);

            int n = Integer.parseInt(br.readLine());

            int [][] C = new int[n][3];

            for (int j = 0; j < n; j++) {
                String[] tmp = br.readLine().split(" ");

                C[j][0] = Integer.parseInt(tmp[0]);
                C[j][1] = Integer.parseInt(tmp[1]);
                C[j][2] = Integer.parseInt(tmp[2]);
            }

            int cnt = 0;

            for (int j = 0; j < n; j++) {
                int R = C[j][2];
                int X = C[j][0];
                int Y = C[j][1];

                int TX1 = x1;
                int TY1 = y1;

                int TX2 = x2;
                int TY2 = y2;

                boolean endInCircle = Math.pow(R,2) > Math.pow(X - TX2, 2) + Math.pow(Y - TY2, 2);

                boolean startInCircle = Math.pow(R,2) > Math.pow(X - TX1, 2) + Math.pow(Y - TY1, 2);

                if (endInCircle && startInCircle) continue;

                if (startInCircle) cnt++;

                if (endInCircle) cnt++;
            }

            sb.append(cnt + "\n");

        }

        System.out.println(sb);

    }

}
