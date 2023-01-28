package bj1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittlePrince {
    public static void main(String[] args) throws IOException {
        // 1. 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1.1
        // T : 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 1.2
            // 출발점 : x1,y1 도착점 : x2,y2
            String[] startEnd = br.readLine().split(" ");
            int x1 = Integer.parseInt(startEnd[0]);
            int y1 = Integer.parseInt(startEnd[1]);
            int x2 = Integer.parseInt(startEnd[2]);
            int y2 = Integer.parseInt(startEnd[3]);

            // 1.3 행성계의 개수 n
            int n = Integer.parseInt(br.readLine());

            // 1.4 행성계의 중점과 반지름 배열 C
            // 중점x  : [][0]
            // 중점y  : [][1]
            // 반지름 : [][2]
            int [][] C = new int[n][3];

            for (int j = 0; j < n; j++) {
                String[] tmp = br.readLine().split(" ");

                C[j][0] = Integer.parseInt(tmp[0]);
                C[j][1] = Integer.parseInt(tmp[1]);
                C[j][2] = Integer.parseInt(tmp[2]);
            }

            // --- 1. 입력 완료 --- //

            // 2.1. 원 안에 두 점이 동시에 존재하지 않고, 출발점만 존재할 경우 cnt + 1

            // cnt : 진입/이탈 횟수 //
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                int R = C[j][2];   // R : 비교할 원의 반지름
                int X = C[j][0];   // X : 비교할 원의 X좌표
                int Y = C[j][1];   // Y : 비교할 원의 Y좌표

                int TX1 = x1;       // x1 : 출발점의 x 좌표
                int TY1 = y1;       // y1 : 출발점의 y 좌표

                int TX2 = x2;       // x2 : 도착점의 x 좌표
                int TY2 = y2;       // y2 : 도착점의 y 좌표

                // 2.1.1. 도착점이 원 내부에 있는지 확인
                boolean endInCircle = Math.pow(R,2) > Math.pow(X - TX2, 2) + Math.pow(Y - TY2, 2);

                // 2.1.2. 출발점이 원 내부에 있는지 확인
                boolean startInCircle = Math.pow(R,2) > Math.pow(X - TX1, 2) + Math.pow(Y - TY1, 2);

                // 2.1.3. 출발점과 도착점이 모두 원 내부에 있는 경우 continue;
                if (endInCircle && startInCircle) continue;

                // 2.1.4. 출발점만 원 내부에 있는 경우 cnt+1;
                if (startInCircle) cnt++;

                // 2.1.5. 도착점만 원 내부에 있는 경우 cnt+1;
                if (endInCircle) cnt++;
            }

            sb.append(cnt + "\n");

        }

        System.out.println(sb);

    }
}
